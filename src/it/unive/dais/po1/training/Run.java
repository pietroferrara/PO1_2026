package it.unive.dais.po1.training;

public class Run extends Workout {
    public Run(String name, int minutes) {
        super(name, minutes);
    }

    @Override
    public int calories() {
        return 10 * this.getMinutes();
    }


    public static String category() {
        return "running";
    }

    public String instancecategory() {
        return "running";
    }

    public String trainWith(Run partner) {
        return this.getName()+" is training with "+partner.getName()+" in a standard running session";
    }

    @Override
    public String trainWith(Workout partner) {
        return this.getName()+" is training with "+partner.getName()+" in a mixed session";
    }
}
