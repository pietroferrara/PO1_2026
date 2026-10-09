package it.unive.dais.po1.meal;

public class Ingredient {
    final String name;
    final IngredientTypeEnum type;
    double pricePerKg;

    //costruttore
    Ingredient(String name, IngredientTypeEnum type, double pricePerKg) {
        this.name = name;
        this.type = type;
        if(pricePerKg > 0) {
            this.pricePerKg = pricePerKg;
        }
        else {
            System.err.println("Price per kg must be positive, setting to 0");
            this.pricePerKg = 0;
        }
    }

    static void discount(Ingredient i, double discount) {
        if(discount >= 0 && discount <= 1 && i.pricePerKg > 0) {
            i.pricePerKg = i.pricePerKg - (i.pricePerKg * discount);
        }
        else System.err.println("Discount must be between 0 and 1 and the price must be positive");
    }

    void discount(double discount) {
        if(discount >= 0 && discount <= 1) {
            this.pricePerKg =
                    this.pricePerKg - (this.pricePerKg * discount);
        }
        else System.err.println("Discount must be between 0 and 1");
    }

}
