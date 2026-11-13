package it.unive.dais.po1.vendingmachines;

public class OutOfStockException extends DispenseException {
    public OutOfStockException(String product) {
        super("Out of stock: "+product);
    }
}
