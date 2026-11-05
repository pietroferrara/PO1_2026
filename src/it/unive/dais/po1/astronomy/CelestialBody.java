package it.unive.dais.po1.astronomy;

public abstract class CelestialBody {
    private String name;
    private double magnitude;

    public CelestialBody(String name, double magnitude) {
        this.name = name;
        this.magnitude = magnitude;
    }

    public String getName() {
        return name;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public boolean brighter(CelestialBody other) {
        return this.magnitude < other.magnitude;
    }
}
