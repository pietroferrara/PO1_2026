package it.unive.dais.po1.museummanagment;

public class Showcase implements Lendable {
    private String borrower = null;
    private int numberOfPieces = 0;
    private String location;

    public Showcase(String location) {
        this.location = location;
    }

    public boolean lendTo(String museum) {
        if (this.borrower == null) {
            this.borrower = museum;
            return true;
        }
        else return false;
    }
    public String giveBack() {
        String borrower = this.borrower;
        this.borrower = null;
        return borrower;
    }

    public boolean isOnLoan() {
        return this.borrower != null;
    }

}
