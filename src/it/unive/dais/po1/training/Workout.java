package it.unive.dais.po1.training;

public class Workout {
    private String name;
    private int minutes;

    public Workout(String name, int minutes) {
        this.name = name;
        this.minutes = minutes;
    }

    public String trainWith(Workout partner) {
        return this.getName()+" is training with "+partner.getName()+" in a standard workout session";
    }

    public String getName() {
        return name;
    }

    public int getMinutes() {
        return minutes;
    }

    public int calories() {
        return 5 * minutes;
    }

    public String summary() {
        return this.name+" -> "+this.calories();
    }

    public static String category() {
        return "generic weak workout";
    }


    public String instancecategory() {
        return "generic weak workout";
    }
}
