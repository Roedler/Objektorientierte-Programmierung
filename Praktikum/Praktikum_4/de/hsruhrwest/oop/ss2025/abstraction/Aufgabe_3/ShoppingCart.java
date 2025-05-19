package Praktikum.Praktikum_4.de.hsruhrwest.oop.ss2025.abstraction.Aufgabe_3;

public class ShoppingCart {
    private static final String DEFAULT_NAME = "Standard-Warenkorb";
    private String name;
    private CartItem[] items;

    public ShoppingCart(String name, CartItem... items) {
        this.name = name;
        this.items = items;
    }

    public ShoppingCart(CartItem... items) {
        this.name = DEFAULT_NAME;
        this.items = items;
    }

    public int getItemCount() {
        return items.length;
    }

    public void clearCart() {
        this.items = new CartItem[0];
    }

    public double getTotalCartPrice() {
        double sum = 0.0;
        for (CartItem item : items) {
            sum += item.getTotalPrice();
        }
        return sum;
    }
}
