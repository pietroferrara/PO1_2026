package it.unive.dais.po1.training;

public class Swim extends Workout {
    private int poolLength;

    public Swim(String name, int minutes, int poolLength) {
        super(name, minutes);
        this.poolLength = poolLength;
    }

    public int getPoolLength() {
        return poolLength;
    }


    public static String category() {
        return "swimming";
    }

    public String instancecategory() {
        return "swimming";
    }
}
