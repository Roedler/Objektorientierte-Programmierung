package Praktikum.Praktikum_2.Aufgaben.de.hsruhrwest.oop.ss2025.arrays;

import java.util.Random;

public class ArrayAnalyse {

    public static void main(String[] args) {
        // Erstelle Array mit 20 Zufallselements
        int[] array = new Random().ints().limit(20).toArray();
    }
}