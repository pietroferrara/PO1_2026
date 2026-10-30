package it.unive.dais.po1.museummanagment;

public class Sculpture extends Artwork implements Insurable {
    private final int insuredValue;

    public Sculpture(String title, String artist, int year, int insuredValue) {
        super(title, artist, year);
        this.insuredValue = insuredValue;
    }

    @Override
    public int insuredValue() {
        return 0;
    }

    @Override
    public String label() {
        return "<void>";
    }
}
