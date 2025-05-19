package Praktikum.Praktikum_4.de.hsruhrwest.oop.ss2025.abstraction.Aufgabe_3;

public class CartItemTotalPrice {
    private String itemName;
    private double totalPrice;
    private int quantity;

    public CartItemTotalPrice(String itemName, double totalPrice, int quantity) {
        this.itemName = itemName;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
    }

    public String getItemName() {
        return this.itemName;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getUnitPrice() {
        return this.totalPrice / this.quantity;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }
}
