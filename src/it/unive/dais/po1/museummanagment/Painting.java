package it.unive.dais.po1.museummanagment;

public class Painting extends Artwork implements Lendable {

    private String borrower = null;

    public Painting(String title, String artist, int year) {
        super(title, artist, year);
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
