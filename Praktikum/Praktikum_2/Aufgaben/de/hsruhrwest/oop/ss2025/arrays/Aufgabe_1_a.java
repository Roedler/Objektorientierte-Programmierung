package Praktikum.Praktikum_2.Aufgaben.de.hsruhrwest.oop.ss2025.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe_1_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Größe n des Arrays ein: ");
        int n = scanner.nextInt();

        long[] array = new long[n];

        for (int i = 0; i < n; i++) {
            array[i] = factorial(i);
        }

        System.out.println("Array mit Fakultäten:");
        System.out.println(Arrays.toString(array));

        scanner.close();
    }

    private static long factorial(long n) {
        if (n == 0) return 1;
        long result = 1;
        for (long i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
