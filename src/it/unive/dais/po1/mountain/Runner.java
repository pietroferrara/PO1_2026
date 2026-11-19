package it.unive.dais.po1.mountain;

public class Runner {
    public static void main(String[] args) {
        Trail t = new Trail("foresta di Mestre", Unit.KM, 2.1, 100);
        System.out.println(t.getLengthKm());
        //System.out.println(t.getLengthMiles());
    }

    @SuppressWarnings("deprecation")
    public boolean isLongerThan(Trail first, Trail other) {
        return first.getLengthKm() > other.getLengthKm();
    }
}

