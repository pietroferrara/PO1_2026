public class Tester {

    public static void main(String[] args) {
        Ingredient tomato = new Ingredient("Tomato", 1.5);
        Dish pizza = new Dish("Pizza", tomato, 100);
        Dish pasta = new Dish("Pasta", tomato, 200);
        pizza.augmentCost(0.5);
        System.out.println(pizza.cost());
        System.out.println(pizza.isCheaperThan(pasta));


        Menu m = new Menu();
        pizza.addTo(m);

        //tomato.name = "Tomato";
        //tomato.pricePerKg = -1.5;

        //Ingredient flour = new Ingredient();
        //flour.name = "Flour";

    }

}
