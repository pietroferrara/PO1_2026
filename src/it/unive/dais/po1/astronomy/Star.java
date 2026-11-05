package it.unive.dais.po1.astronomy;

public class Star extends CelestialBody {
    private final String constellation;

    public Star(String name, double magnitude, String constellation) {
        super(name, magnitude);
        this.constellation = constellation;
    }

}
