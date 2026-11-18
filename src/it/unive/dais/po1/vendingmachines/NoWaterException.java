package it.unive.dais.po1.vendingmachines;

public class NoWaterException extends DispenseException {
    public NoWaterException(String product) {
        super("No water for product "+product);

    }
}
