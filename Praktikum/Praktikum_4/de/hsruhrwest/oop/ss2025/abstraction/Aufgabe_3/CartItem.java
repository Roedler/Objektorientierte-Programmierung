package Praktikum.Praktikum_4.de.hsruhrwest.oop.ss2025.abstraction.Aufgabe_3;

public class CartItem {
    private String itemName;
    private double unitPrice;
    private int quantity;

    public CartItem(String itemName, double unitPrice, int quantity) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getItemName() {
        return this.itemName;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getTotalPrice() {
        return this.unitPrice * this.quantity;
    }
}
