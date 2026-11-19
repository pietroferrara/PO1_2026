package it.unive.dais.po1.mountain;

@Difficulty(level=Difficulty.Level.MEDIUM)
public class Trail {
    private final String name;

    @Measure("km")
    private final double lengthKm;

    @Measure("meter")
    private final int dislivello;

    public Trail(String name, Unit unit, @Measure("km") double length, @Measure("meter") int dislivello) {
        this.name = name;
        this.dislivello = dislivello;
        this.lengthKm = unit.toKm(length);
    }

    @Measure("unknown")
    public double getLength(Unit unit) {
        return unit.fromKm(lengthKm);
    }

    @Measure("min")
    public double estimatedTime() {
        return this.lengthKm/(5.0-this.dislivello/(this.lengthKm*1000))*60.0;
    }

    @Deprecated(since="2.0")
    @Measure("km")
    public double getLengthKm() {
        return lengthKm;
    }

    @Deprecated(since="2.0", forRemoval=true)
    @Measure("miles")
    public double getLengthMiles() {
        return lengthKm * 0.621371;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "'" + name + '\'' +
                //", unit=" + unit +
                ", length=" + lengthKm;
    }
}
