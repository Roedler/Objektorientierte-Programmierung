package Praktikum.Praktikum_2.Aufgaben.de.hsruhrwest.oop.ss2025.arrays;

import java.util.Arrays;
import java.util.Random;

public class Aufgabe_2_a {
    public static void main(String[] args) {
        int lowerBound = 0;
        int upperBound = 20;
        int size = 20;
        int[] array = new Random().ints(lowerBound, upperBound).limit(size).toArray();

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int value : array) {
            if (value < min) {
                secondMin = min;
                min = value;
            } else if (value < secondMin && value != min) {
                secondMin = value;
            }
            if (value > max) {
                max = value;
            }
        }

        System.out.println("Array-Inhalt (unsortiert):");
        System.out.println(Arrays.toString(array));
        System.out.println();

        Arrays.sort(array);
        System.out.println("Array-Inhalt (sortiert):");
        System.out.println(Arrays.toString(array));
        System.out.println();

        System.out.println("Minimum: " + min);
        System.out.println("Zweitkleinstes Element: " + (secondMin == Integer.MAX_VALUE ? "Nicht vorhanden" : secondMin));
        System.out.println("Maximum: " + max);
    }
}
