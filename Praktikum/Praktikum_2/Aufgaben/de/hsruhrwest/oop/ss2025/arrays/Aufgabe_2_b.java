package Praktikum.Praktikum_2.Aufgaben.de.hsruhrwest.oop.ss2025.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Aufgabe_2_b {
    public static void main(String[] args) {
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
