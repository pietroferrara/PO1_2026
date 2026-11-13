package it.unive.dais.po1.vendingmachines;

public class UnknownProductException extends DispenseException {
    public UnknownProductException(String product) {
        super("Unknown product: "+product);
    }
}
