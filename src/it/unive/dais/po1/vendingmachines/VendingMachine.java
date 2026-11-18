package it.unive.dais.po1.vendingmachines;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private final List<Slot> slots = new ArrayList<>();
    private boolean doorOpen = false;

    public void addSlot(Slot slot) {
        slots.add(slot);
    }

    private int served = 0;
    private int failed = 0;

    /**
     * Tenta di disporre un prodotto, se non esiste ritorna -1
     * @param product - nome del prodotto da disporre
     * @return - il prezzo del prodotto dispensato o -1 se il prodotto non esiste
     */
    public int tryToDispense(String product) {
        try {
            int paid = this.dispense(product);
            this.served++;
            System.out.println(product + ": " + paid
                    + " cents");
            return paid;
        } catch (UnknownProductException e) {
            this.failed++;
            System.err.println(product + ": please choose another product");
            return -1;
        } catch (DispenseException e) {
            this.failed++;
            System.err.println(product + ": " + e.getMessage());
            return -1;
        }
    }


    /**
     * Ritorno un prodotto se esiste nella macchinetta
     * @param product - nome del prodotto da ritornare
     * @return - il prezzo del prodotto ritornato
     * @throws OutOfStockException - se il prodotto e' esaurito
     * @throws UnknownProductException - se il prodotto non esiste
     */
    public int dispense(String product) throws DispenseException {
        for(Slot slot : slots) {
            if(slot.getProduct().equals(product)) {
                if(slot.getQuantity()>0) {
                    slot.take();
                    try {
                        this.doorOpen = true;
                        int price = slot.getPrice();
                        this.doorOpen = false;
                        return price;
                    }
                    catch(Exception e) {
                        System.err.println("Unexpected exception");
                        throw new DispenseException("Unexpected anormal behaviour of the vending machine", e);
                    }
                    finally {
                        this.doorOpen = false;
                        //throw new IllegalStateException("Unknown state of the vending machine");
                    }
                }
                else //ferma l'esecuzione con una OutOfStockException
                     throw new OutOfStockException(product);
            }
        }
        throw new UnknownProductException(product);
    }

    @Override
    public String toString() {
        return slots.toString();
    }
}
