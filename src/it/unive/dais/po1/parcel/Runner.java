package it.unive.dais.po1.parcel;

public class Runner {

    public static void main(String[] args) {
        Courier c = new Courier("Pietro");

        Parcel p2 = c.pack("standard", "Venice", 2);
        //FragileParcel p3 = (FragileParcel) p2; ERROR: Parcel cannot be cast to FragileParcel
        //p3.wrap();
        c.delivery(p2);   //7.0 EUR

        p2 = c.pack("fragile", "Venice", 2);
        c.delivery(p2);   //10.0 EUR
        ExpressParcel p4 = (ExpressParcel) c.pack("express", "Venice", 2);
        c.delivery(p4);   //14.0 EUR
        ColdParcel p3 = (ColdParcel) c.pack("cold", "Venice", 2);
        p2 = (Parcel) p3; //Warning: inutile/ridondante, possiamo fare direttamente p2 = p3;
        //p3 = (ColdParcel) p4; ERROR incompatible types
        c.delivery(p3);   //15.0 EUR





    }
}
