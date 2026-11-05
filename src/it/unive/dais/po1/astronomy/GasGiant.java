package it.unive.dais.po1.astronomy;

public class GasGiant extends Planet {
    private final boolean rings;

    public GasGiant(String name, double magnitude, int moons, boolean rings) {
        super(name, magnitude, moons);
        this.rings = rings;
    }

    public boolean hasRings() {
        return rings;
    }
}
