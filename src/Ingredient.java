public class Ingredient {
    final String name;
    double pricePerKg;

    //costruttore
    Ingredient(String name, double pricePerKg) {
        this.name = name;
        if(pricePerKg > 0) {
            this.pricePerKg = pricePerKg;
        }
        else {
            System.err.println("Price per kg must be positive, setting to 0");
            this.pricePerKg = 0;
        }
    }
}
