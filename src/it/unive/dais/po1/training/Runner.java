package it.unive.dais.po1.training;

public class Runner {

    public static void main(String[] args) {
        Workout w = new Workout("Walk", 10);
        Run r = new Run("Run", 10);
        TrailRun tr = new TrailRun("TrailRun", 5, 10);
        Swim s = new Swim("Swim", 15, 25);

        Runner.log(w);
        Runner.log(r);
        Runner.log(tr);
        Runner.log(s);

        System.out.println(w.summary());
        System.out.println(r.summary());
        System.out.println(tr.summary());
        System.out.println(s.summary());

        Run r1 = new Run("morning run", 30),
                r2 = new Run("evening run", 20);
        Swim s3 = new Swim("pool session", 40, 25);
        Workout w1 = r1, w2 = r2, w3 = s3;

        //System.out.println(r1.category());
        //System.out.println(s3.category());
        System.out.println(w1.category());
        System.out.println(w1.instancecategory());


        Runner.compare(r1, r2);  //(Run, Run)
        Runner.compare(r1, w3);  //(Run, Workout)
        Runner.compare(w1, s3);  //(Workout, Workout)
        Runner.compare(w1, w2);  //(Workout, Workout)!

        Workout w7 = null;
        System.out.println(w7.category());
        //System.out.println(w7.instancecategory());

        Run road = new Run("road run", 30);
        TrailRun trail = new TrailRun(
                "Dolomites trail", 40, 600);
        //Runner.compare(road, trail);
//error: reference to compare is ambiguous
//  both method compare(Run,Workout) and
//  method compare(Workout,TrailRun) match
        Runner.compare(road, (Run) trail);
//compare(Run, Run)
        Runner.compare((Workout) road, trail);
//compare(Workout, TrailRun)



        Run anna = new Run("Anna's run", 30);
        Run bruno = new Run("Bruno's run", 25);
        Workout w8 = anna;
        anna.trainWith(bruno);
        //Run.trainWith(Run)
        w8.trainWith(bruno);
        //Run.trainWith(Workout)



    }

    public static String compare(Workout a, Workout b) {
        if(a.calories() > b.calories())
            return a.getName();
        else return b.getName();
    }
    public static String compare(Run a, Run b) {
        if(a.calories() > b.calories())
            return a.getName();
        else return b.getName();
    }
    public static String compare(Run a, Workout b) {
        return a.getName();
    }

    public static String compare(Workout a, TrailRun b) {
        return b.getName();
    }  //new




    public static void log(Workout w) {
        System.out.println(w.getName() + " -> " + w.calories());
    }
}
