package Praktikum.Praktikum_2.Aufgaben.Aufgabe_2;

import java.util.Random;

public class Duplicates {

    public static void main(String[] args) {
        // Arrays mit Zufallselementen erstellen
        int upperBound = 20;
        int size = 50;
        int[] array1 = new Random().ints(0, upperBound).limit(size).toArray();
        int[] array2 = new Random().ints(0, upperBound).limit(size).toArray();
    }
}
