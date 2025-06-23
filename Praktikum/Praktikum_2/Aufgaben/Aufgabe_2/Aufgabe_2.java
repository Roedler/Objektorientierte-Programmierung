package Praktikum.Praktikum_2.Aufgaben.Aufgabe_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Aufgabe_2 {

    // =================================================================================================================
    // Aufgabe 2 a
    // =================================================================================================================
    public static void a() {
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

    // =================================================================================================================
    // Aufgabe 2 b
    // =================================================================================================================
    public static void b() {
        int lowerBound = 0;
        int upperBound = 20;
        int size = 20;
        int[] array1 = new Random().ints(lowerBound, upperBound).limit(size).toArray();
        int[] array2 = new Random().ints(lowerBound, upperBound).limit(size).toArray();

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int value : array1) {
            set1.add(value);
        }

        for (int value : array2) {
            if (set1.contains(value)) {
                duplicates.add(value);
            }
        }

        System.out.println("Array 1:");
        System.out.println(Arrays.toString(array1));

        System.out.println("\nArray 2:");
        System.out.println(Arrays.toString(array2));
        System.out.println();

        System.out.println("Gemeinsame Elemente:");
        System.out.println(Arrays.toString(duplicates.toArray()));
    }
}
