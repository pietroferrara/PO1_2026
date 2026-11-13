package it.unive.dais.po1.vendingmachines;

public class CoffeeMachine extends VendingMachine {
    private int water;//cl di acqua presenti nella macchina
    private static final int CUP_DIMENSION = 50;
    public CoffeeMachine(int water) {
        this.water = water;
    }

    @Override
    public int dispense(String product) {
        if(this.water > CUP_DIMENSION) {
            int price = super.dispense(product);
            this.water = this.water - CUP_DIMENSION;
            return price;
        }
        else throw new NoWaterException(product);
    }
}
