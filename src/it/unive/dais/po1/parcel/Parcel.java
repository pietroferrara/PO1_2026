package it.unive.dais.po1.parcel;

public class Parcel {
    private String destination;
    private int kgs;

    public Parcel(String destination, int kgs) {
        this.destination = destination;
        this.kgs = kgs;
    }

    public String getDestination() {
        return destination;
    }

    public int getKgs() {
        return kgs;
    }

    public double cost() {
        return 5 + 2*this.kgs;
    }

    protected void setKgs(int kgs) {
        this.kgs = kgs;
    }

    public String label() {
        return "Pacco per " + this.destination + ", peso " + this.kgs + " kg";
    }

}
