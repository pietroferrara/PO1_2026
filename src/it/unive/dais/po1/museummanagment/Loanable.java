package it.unive.dais.po1.museummanagment;

public interface Loanable extends Lendable, Returnable {

    public default String label() {
        return "loanable";
    }
}
