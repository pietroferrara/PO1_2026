package it.unive.dais.po1.museummanagment;

public class Runner {
    public static void main(String[] args) {
        Painting p = new Painting("Guernica", "Picasso", 1940);
        Showcase s = new Showcase("PeggyGuggenheim");
        System.out.println(status(p));
        Runner.lendTo(p, "Louvre");
        System.out.println(status(p));
        Runner.lendTo(s, "Louvre");


        //p.lendTo("Louvre");
        //s.lendTo("Louvre");
    }

    private static String status(Artwork a) {
        if (a instanceof Lendable) {
            Lendable l = (Lendable) a;
            return a.describe() + (l.isOnLoan()
                    ? ": on loan" : ": in the museum");
        }
        return a.describe() + ": never lent";
    }


    private static void lendTo(Lendable l, String museum) {
        l.lendTo(museum);
    }
}
