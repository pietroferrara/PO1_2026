package it.unive.dais.po1.meal;

public class Menu {
    double totalCost = 0;
    int numberOfDishes = 0;

    void register(Dish d) {
        totalCost = totalCost + d.cost();
        numberOfDishes = numberOfDishes + 1;
    }

}
