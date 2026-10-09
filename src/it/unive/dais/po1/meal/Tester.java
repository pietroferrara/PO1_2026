package it.unive.dais.po1.meal;

public class Tester {

    public static void main(String[] args) {
        Ingredient tomato = new Ingredient("Tomato", IngredientTypeEnum.VEGETABLE, 1.5);
        Ingredient carrot = new Ingredient("Carrot", IngredientTypeEnum.VEGETABLE, 1.0);
        Ingredient apple = new Ingredient("Apple", IngredientTypeEnum.FRUIT, 0.5);
        Ingredient saussige = new Ingredient("Sausage", IngredientTypeEnum.MEAT, 6.5);
        Ingredient cheese = new Ingredient("Cheese", IngredientTypeEnum.DIARY, 3.5);



        //it.unive.dais.po1.meal.Dish pizza = new it.unive.dais.po1.meal.Dish("Pizza", tomato, 100);
        ///it.unive.dais.po1.meal.Dish pasta = new it.unive.dais.po1.meal.Dish("Pasta", tomato, 200);
        //pizza.augmentCost(0.5);
        //System.out.println(pizza.cost());
        //System.out.println(pizza.isCheaperThan(pasta));


        //tomato.discount(0.2);

        //it.unive.dais.po1.meal.Ingredient.discount(tomato, 0.2);

        //it.unive.dais.po1.meal.Menu m = new it.unive.dais.po1.meal.Menu();
        //pizza.addTo(m);

        //tomato.name = "Tomato";
        //tomato.pricePerKg = -1.5;

        //it.unive.dais.po1.meal.Ingredient flour = new it.unive.dais.po1.meal.Ingredient();
        //flour.name = "Flour";

    }

}
