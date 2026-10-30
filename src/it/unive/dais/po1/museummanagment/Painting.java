package it.unive.dais.po1.museummanagment;

public class Painting extends Artwork implements Lendable, Exhibitable {
    private String borrower = null;

    private final int insuredValue;


    public Painting(String title, String artist, int year, int insuredValue) {
        super(title, artist, year);
        this.insuredValue = insuredValue;
    }


    @Override
    public String getBorrower() {
        return borrower;
    }

    @Override
    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    @Override
    public int insuredValue() {
        return this.insuredValue;
    }

    @Override
    public String label() {
        return Lendable.super.label() + " and "+Exhibitable.super.label();
    }
}
