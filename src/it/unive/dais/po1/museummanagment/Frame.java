package it.unive.dais.po1.museummanagment;

public class Frame implements Loanable {
    private String borrower = null;

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
        return 0;
    }
}
