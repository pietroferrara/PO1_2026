package it.unive.dais.po1.parcel;

public class Runner {

    public static void main(String[] args) {
        Parcel p = new Parcel("Roma", 10);
        FragileParcel fp = new FragileParcel("Napoli", 8);
        ColdParcel cp = new ColdParcel("Torino", 12);
        ExpressParcel ep = new ExpressParcel("Milano", 15);

        fp.wrap();
        fp.wrap();
        cp.wrap();

        Courier c = new Courier("Pietro");
        c.delivery(p);
        c.delivery(fp);
        c.delivery(cp);
        c.delivery(ep);


        FragileParcel vase = new FragileParcel("Milan", 2);
        Parcel v = vase;
        double price = v.cost();     //double
        boolean heavy = p.getKgs() > 10;          //boolean
        vase.wrap();                 //OK
        //v.wrap(); NON COMPILA
        //int address = (int) vase; non compila

        Parcel p1 = new Parcel("Roma", 10);
        FragileParcel fp1 = new FragileParcel("Napoli", 8);
        ColdParcel cp1 = new ColdParcel("Torino", 12);
        ExpressParcel ep1 = new ExpressParcel("Milano", 15);

        p1 = fp1;
        p1 = cp1;
        p1 = ep1;

        fp1 = cp1;
        //fp1 = ep1; NON COMPILA
        //fp1 = p1; NON COMPILA


        Parcel p2 = c.pack("standard", "Venice", 2);
        c.delivery(p2);   //7.0 EUR
        p2 = c.pack("fragile", "Venice", 2);
        c.delivery(p2);   //10.0 EUR
        p2 = c.pack("express", "Venice", 2);
        c.delivery(p2);   //14.0 EUR
        p2 = c.pack("cold", "Venice", 2);
        c.delivery(p2);   //15.0 EUR



    }
}
