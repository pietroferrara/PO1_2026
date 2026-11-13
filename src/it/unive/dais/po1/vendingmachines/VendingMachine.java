package it.unive.dais.po1.vendingmachines;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private final List<Slot> slots = new ArrayList<>();

    public void addSlot(Slot slot) {
        slots.add(slot);
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
                    return slot.getPrice();
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
