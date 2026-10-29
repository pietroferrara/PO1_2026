package it.unive.dais.po1.parcel;

public class Courier {
    private String name;
    private double earned_money = 0.0;

    public Courier(String name) {
        this.name = name;
    }

    public Parcel pack(String type, String destination, int kg) {
        if(type.equals("fragile")) return new FragileParcel(destination, kg);
        else if(type.equals("express")) return new ExpressParcel(destination, kg);
        else if(type.equals("cold")) return new ColdParcel(destination, kg);
        else return new Parcel(destination, kg);
    }

    public String getName() {
        return name;
    }

    public void delivery(Parcel p) {
        System.out.println("shipping "
                + p.label() + ": " + p.cost() + " EUR");
        //Se ho un pacco fragile, controllo se e' stato imballato
        if(p instanceof FragileParcel) {//true iff p e' istanza di FragileParcel o di una sottoclasse
            FragileParcel p1 = (FragileParcel) p;
            if(p1.isWrapped() == false) {
                p1.wrap();
            }
        }
        //Se non e' stato imballato, lo imballo prima di consegnarlo
        earned_money = earned_money + p.cost();
    }

    public double getEarnedMoney() {
        return earned_money;
    }


}
