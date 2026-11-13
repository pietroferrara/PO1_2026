package it.unive.dais.po1.vendingmachines;

public class Runner {

    public static void main(String[] args) throws DispenseException {
        VendingMachine machine = new VendingMachine();
        machine.addSlot(new Slot("Coca Cola", 2, 1));
        machine.addSlot(new Slot("Pepsi", 1, 10));
        machine.addSlot(new Slot("Sprite", 3, 5));

        int money = 0;
        money += machine.dispense("Coca Cola");
        money += machine.dispense("Pepsi");
        money += machine.dispense("Pepsi");

        money += machine.dispense("Pepsi");

        money += machine.dispense("Sprite");

        money += machine.dispense("Fanta");

        System.out.println(machine.toString());
        System.out.println("I spent "+money);


    }
}
