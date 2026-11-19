package it.unive.dais.po1.mountain;

public enum Unit {
    KM(1.0), MILE(1.6);

    private final double perKm;

    Unit(double v) {
        this.perKm = v;
    }

    public double toKm(double n) {
        return n * perKm;
    }

    public double fromKm(double n) {
        return n / perKm;
    }
}
