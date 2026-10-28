package it.unive.dais.po1.parcel;

public class ColdParcel extends FragileParcel {
    public ColdParcel(String destination, int kgs) {
        super(destination, kgs);
    }

    @Override
    public double cost() {
        return 5.0+super.cost();
    }
}
