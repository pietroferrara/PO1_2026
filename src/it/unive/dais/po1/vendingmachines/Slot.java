package it.unive.dais.po1.vendingmachines;

public class Slot {
    private final String product;
    private final int price;
    private int quantity;

    public Slot(String product, int price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    void take() {
        this.quantity--;
    }

    @Override
    public String toString() {
        return product + " " + price + " euros " + quantity;
    }
}
