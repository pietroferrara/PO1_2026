package it.unive.dais.po1.parcel;

public class FragileParcel extends Parcel{
    private int wrap_count = 0;

    public FragileParcel(String destination, int kgs) {
        super(destination, kgs);
    }

    public void wrap() {
        this.setKgs(this.getKgs()+1);
        wrap_count++;
    }

    public boolean isWrapped() {
        return wrap_count > 0;
    }

    @Override
    public double cost() {
        return 1.5*super.cost();
    }

    @Override
    public String label() {
        return "Fragile, imballato "+this.wrap_count+" volte, "+super.label();
    }

}
