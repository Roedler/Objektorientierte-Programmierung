package Praktikum.Praktikum_4.de.hsruhrwest.oop.ss2025.abstraction;

import java.time.LocalDate;
import Praktikum.Praktikum_4.de.hsruhrwest.oop.ss2025.abstraction.Aufgabe_2.Cuboid;
import Praktikum.Praktikum_4.de.hsruhrwest.oop.ss2025.abstraction.Aufgabe_2.Cylinder;
import Praktikum.Praktikum_4.de.hsruhrwest.oop.ss2025.abstraction.Aufgabe_2.Sphere;
import Praktikum.Praktikum_4.de.hsruhrwest.oop.ss2025.abstraction.Aufgabe_3.CartItem;
import Praktikum.Praktikum_4.de.hsruhrwest.oop.ss2025.abstraction.Aufgabe_3.CartItemTotalPrice;
import Praktikum.Praktikum_4.de.hsruhrwest.oop.ss2025.abstraction.Aufgabe_3.ShoppingCart;
import Praktikum.Praktikum_4.de.hsruhrwest.oop.ss2025.abstraction.Aufgabe_4.Employee;

public class Praktikum_4 {
    public static void main(String[] args) {
//        aufgabe_2();    // geometric classes
//        aufgabe_3_a();  // cart item
//        aufgabe_3_b();  // cart item total price
//        aufgabe_3_c();  // shopping cart
//        aufgabe_4();    // employee
    }

    public static void aufgabe_2() {
        Cuboid cuboid = new Cuboid(5, 10, 15);
        System.out.println("Cuboid:");
        System.out.println("Volume: " + cuboid.getVolume());
        System.out.println("Surface area: " + cuboid.getSurfaceArea() + "\n");

        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println("Cylinder:");
        System.out.println("Volume: " + cylinder.getVolume());
        System.out.println("Surface area: " + cylinder.getSurfaceArea() + "\n");

        Sphere sphere = new Sphere(5);
        System.out.println("Sphere:");
        System.out.println("Volume: " + sphere.getVolume());
        System.out.println("Surface area: " + sphere.getSurfaceArea() + "\n");
    }

    public static void aufgabe_3_a() {
        CartItem cartItem = new CartItem("Apple", 0.5, 3);
        System.out.println("Cart item:");
        System.out.println("Item name: " + cartItem.getItemName());
        System.out.println("Unit price: " + cartItem.getUnitPrice());
        System.out.println("Quantity: " + cartItem.getQuantity());
        System.out.println("Total price: " + cartItem.getTotalPrice() + "\n");
    }

    public static void aufgabe_3_b() {
        CartItemTotalPrice cartItemTotalPrice = new CartItemTotalPrice("Apple", 1.5, 3);
        System.out.println("Cart item total price:");
        System.out.println("Item name: " + cartItemTotalPrice.getItemName());
        System.out.println("Quantity: " + cartItemTotalPrice.getQuantity());
        System.out.println("Unit price: " + cartItemTotalPrice.getUnitPrice());
        System.out.println("Total price: " + cartItemTotalPrice.getTotalPrice() + "\n");
    }

    public static void aufgabe_3_c() {
        ShoppingCart shoppingCart = new ShoppingCart(
                "Cooler Warenkorb",
                new CartItem("Apple", 0.5, 3),
                new CartItem("Banana", 0.25, 10),
                new CartItem("Pineapple", 1.1, 2),
                new CartItem("Mango", 2.5, 1)
        );
        System.out.println("Shopping cart:");
        System.out.println("Item count: " + shoppingCart.getItemCount());
        System.out.println("Total price: " + shoppingCart.getTotalCartPrice() + "\n");
        shoppingCart.clearCart();
        System.out.println("Item count: " + shoppingCart.getItemCount());
    }

    public static void aufgabe_4 () {
        Employee employee1 = new Employee("Lennart Novak", LocalDate.of(2002, 2, 19));
        Employee employee2 = new Employee("Karina Sturm", LocalDate.of(2000, 3, 27));
        Employee employee3 = new Employee("Elias Reich", LocalDate.of(2002, 12, 15));
        Employee employee4 = new Employee("Luka Zielke", LocalDate.of(2002, 10, 5));
        Employee employee5 = new Employee("Emily Aschmoneit", LocalDate.of(2003, 7, 2));

        System.out.println("Employee 1:");
        System.out.println("ID: " + employee1.getId());
        System.out.println("Name: " + employee1.getName());
        System.out.println("Birth date: " + employee1.getBirthDate() + "\n");

        System.out.println("Employee 2:");
        System.out.println("ID: " + employee2.getId());
        System.out.println("Name: " + employee2.getName());
        System.out.println("Birth date: " + employee2.getBirthDate() + "\n");

        System.out.println("Employee 3:");
        System.out.println("ID: " + employee3.getId());
        System.out.println("Name: " + employee3.getName());
        System.out.println("Birth date: " + employee3.getBirthDate() + "\n");

        System.out.println("Employee 4:");
        System.out.println("ID: " + employee4.getId());
        System.out.println("Name: " + employee4.getName());
        System.out.println("Birth date: " + employee4.getBirthDate() + "\n");

        System.out.println("Employee 5:");
        System.out.println("ID: " + employee5.getId());
        System.out.println("Name: " + employee5.getName());
        System.out.println("Birth date: " + employee5.getBirthDate() + "\n");
    }
}
