package it.unive.dais.po1.vendingmachines;

public class DispenseException extends Exception {
    public DispenseException(String message) {
        super(message);
    }

    public DispenseException(String message, Exception e) {
        super(message, e);
    }
}
