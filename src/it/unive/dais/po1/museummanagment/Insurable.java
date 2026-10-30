package it.unive.dais.po1.museummanagment;

public interface Insurable {
    int insuredValue();


    public default String label() {
        return "insurable";
    }
}
