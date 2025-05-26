package Praktikum.Praktikum_6.de.hsruhrwest.oop.ss2025.assignment6;

import Praktikum.Praktikum_6.de.hsruhrwest.oop.ss2025.assignment6.Aufgabe_1.*;
import Praktikum.Praktikum_6.de.hsruhrwest.oop.ss2025.assignment6.Aufgabe_2.*;

public class Praktikum_6 {

    public static void main(String[] args) {
//        Aufgabe_1();
        Aufgabe_2();
    }

    public static void Aufgabe_1() {
        Spoon spoon = new Spoon("Holzlöffel", "Holz");
        System.out.println("Name: " + spoon.getName());
        System.out.println("Material: " + spoon.getMaterial());

        Toaster toaster = new Toaster("Küchentoaster", 1200, true);
        System.out.println("\nName: " + toaster.getName());
        System.out.println("Stromverbrauch: " + toaster.getPowerConsumption() + " Watt");
        System.out.println("Auftaufunktion: " + (toaster.hasDefrostFunction() ? "Ja" : "Nein"));
        System.out.println("Mindestalter: " + toaster.getMinimumAge() + " Jahre");

        MobilePhone phone = new MobilePhone("Smartphone", 10, true);
        System.out.println("\nName: " + phone.getName());
        System.out.println("Stromverbrauch: " + phone.getPowerConsumption() + " Watt");
        System.out.println("Batterielaufzeit: " + phone.getBatteryLife() + " Stunden");
        System.out.println("Internetfähig: " + (phone.hasInternetAccess() ? "Ja" : "Nein"));

        KitchenScale scale = new KitchenScale("Digitale Waage", 5000);
        System.out.println("\nName: " + scale.getName());
        System.out.println("Maximales Gewicht: " + scale.getMaxWeight() + " g");
        System.out.println("Batterielaufzeit: " + scale.getBatteryLife() + " Stunden");

        Blender blender = new Blender("Pürierstab", 18000);
        System.out.println("\nName: " + blender.getName());
        System.out.println("Klingengeschwindigkeit: " + blender.getBladeSpeed() + " U/min");
        System.out.println("Stromverbrauch: " + blender.getPowerConsumption() + " Watt");
        System.out.println("Mindestalter: " + blender.getMinimumAge() + " Jahre");

        Bowl bowl = new Bowl("Glasschale", 1.5);
        System.out.println("\nName: " + bowl.getName());
        System.out.println("Volumen: " + bowl.getVolume() + " Liter");
    }

    public static void Aufgabe_2() {
        String[] testStrings = {"Hallo Welt", " OpenAI GPT ", "  Java Programmierung "};

        System.out.println("Leerzeichen entfernen:");
        AbstractStringTransformer remover = new SpaceRemover();
        remover.transform(testStrings.clone());

        System.out.println("\nStrings umkehren:");
        AbstractStringTransformer reverser = new Reverser();
        reverser.transform(testStrings.clone());
    }
}
