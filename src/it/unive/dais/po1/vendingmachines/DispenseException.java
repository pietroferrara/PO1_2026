package it.unive.dais.po1.vendingmachines;

public abstract class DispenseException extends RuntimeException {
    public DispenseException(String message) {
        super(message);
    }
}
