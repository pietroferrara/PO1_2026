package it.unive.dais.po1.museummanagment;

public interface Lendable extends Insurable {

    public String getBorrower();
    public void setBorrower(String borrower);

    public default boolean lendTo(String museum) {
        if (this.getBorrower() == null) {
            this.setBorrower(museum);
            return true;
        }
        else return false;
    }

    public default boolean isOnLoan() {
        return this.getBorrower() != null;
    }



}
