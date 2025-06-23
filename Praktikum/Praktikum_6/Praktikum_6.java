package Praktikum.Praktikum_6;

import Praktikum.Praktikum_6.Aufgaben.Aufgabe_1.*;
import Praktikum.Praktikum_6.Aufgaben.Aufgabe_2.*;
import Praktikum.Praktikum_6.Aufgaben.Aufgabe_3.*;
import Praktikum.Praktikum_6.Aufgaben.Aufgabe_4.*;

public class Praktikum_6 {

    public static void main(String[] args) {
//        Aufgabe_1();
//        Aufgabe_2();
//        Aufgabe_3();
        Aufgabe_4();
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
        String[] testStrings = {"Hallo Welt", " Hier sind ganz viele Leerzeichen enthalten. ", " Hier wird der String umgekehrt "};

        System.out.println("Leerzeichen entfernen:");
        SpaceRemover remover = new SpaceRemover();
        remover.transform(testStrings.clone());

        System.out.println("\nStrings umkehren:");
        Reverser reverser = new Reverser();
        reverser.transform(testStrings.clone());
    }

    public static void Aufgabe_3() {
        var nodeA = new Node<String, Integer>("A", 5);
        var nodeB = new Node<String, Integer>("B", 2, nodeA);
        var nodeC = new Node<String, Integer>("C", 1, nodeB);
        nodeC.print();
    }

    public static void Aufgabe_4() {
        String[] words = {"Apfel", "Banane", "Apfel", "Orange", "Banane", "Banane", "Kiwi"};
        Statistic<String> stats = Statistic.getArrayStatistic(words);
        System.out.println(stats);
    }
}
