public class Dish {
    final String name;
    final Ingredient main;
    double grams;
    static int numberOfDishes = 0;

    Dish(String name, Ingredient main, double grams) {
        this.name = name;
        if(main == null) {
            System.err.println("No main ingredient");
        }
        this.main = main;
        if(grams <= 0) {
            System.err.println("Grams must be positive, setting to 0");
            this.grams = 0;
        }
        else this.grams = grams;
        Dish.numberOfDishes = Dish.numberOfDishes + 1;
    }

    Dish(Ingredient main, double kg) {
        double convertiongrams = kg * 1000;
        System.out.println("grams: " + convertiongrams);
        this("Dish number "+Dish.numberOfDishes, main, convertiongrams);
    }

    double cost() {
        double kgs = grams / 1000;
        return kgs * this.main.pricePerKg;
    }

    void augmentCost(double gap) {
        this.main.pricePerKg = this.main.pricePerKg + gap;
    }

    boolean isCheaperThan(Dish d) {
        return this.cost() < d.cost();
    }

    void addTo(Menu m) {
        m.register(this);
        m = null;
    }


}
