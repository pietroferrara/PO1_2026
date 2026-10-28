package it.unive.dais.po1.parcel;

public class ExpressParcel extends Parcel {
    public ExpressParcel(String destination, int kgs) {
        super(destination, kgs);
    }

    @Override
    public double cost() {
        return 2*super.cost();
    }

    @Override
    public String label() {
        return "Consegna Express, "+super.label();
    }
}
