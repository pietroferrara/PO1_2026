package it.unive.dais.po1.training;

public class TrailRun extends Run {
    private int climb;

    public TrailRun(String name, int minutes, int climb) {
        super(name, minutes);
        this.climb = climb;
    }

    public int getClimb() {
        return climb;
    }

    public static String category() {
        return "running up to the hill";
    }

    public String instancecategory() {
        return "running up to the hill";
    }
}
