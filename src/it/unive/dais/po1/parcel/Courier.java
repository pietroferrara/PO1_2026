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
        earned_money = earned_money + p.cost();
    }

    public double getEarnedMoney() {
        return earned_money;
    }


}
