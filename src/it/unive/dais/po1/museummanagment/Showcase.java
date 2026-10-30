package it.unive.dais.po1.museummanagment;

public class Showcase implements Loanable {
    private String borrower = null;
    private int numberOfPieces = 0;
    private String location;

    public Showcase(String location) {
        this.location = location;
    }

    @Override
    public String getBorrower() {
        return this.borrower;
    }

    @Override
    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    @Override
    public int insuredValue() {
        return 0;
    }
}
