package it.unive.dais.po1.astronomy;

public class Planet extends CelestialBody {
    private final int moons;

    public Planet(String name, double magnitude, int moons) {
        super(name, magnitude);
        this.moons = moons;
    }

}
