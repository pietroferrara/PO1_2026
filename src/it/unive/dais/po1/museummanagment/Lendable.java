package it.unive.dais.po1.museummanagment;

public interface Lendable {
    public boolean lendTo(String museum);
    public String giveBack();
    public boolean isOnLoan();
}
