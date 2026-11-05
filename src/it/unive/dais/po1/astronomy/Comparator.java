package it.unive.dais.po1.astronomy;

public class Comparator<T extends CelestialBody> {
    private final T a, b;
    public Comparator(T a, T b) {
        this.a = a;
        this.b = b;
    }
    public T brighter() {
        if(this.a.brighter(this.b))
            return this.a;
        else return this.b;
    }
}
