package it.unive.dais.po1.museummanagment;

public interface Returnable {

    public String getBorrower();
    public void setBorrower(String borrower);

    public default String giveBack() {
        String borrower = this.getBorrower();
        this.setBorrower(null);
        return borrower;
    }

    public default String label() {
        return "returnable";
    }

}
