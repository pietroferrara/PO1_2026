package it.unive.dais.po1.mountain;

public class Trail {
    private final String name;
    private final Unit unit;
    private final double length;

    public Trail(String name, Unit unit, double length) {
        this.name = name;
        this.unit = unit;
        this.length = length;
    }

    @Override
    public String toString() {
        return "'" + name + '\'' +
                ", unit=" + unit +
                ", length=" + length;
    }
}
