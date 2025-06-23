package Praktikum.Praktikum_2.Aufgaben;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe_1 {

    // =================================================================================================================
    // Aufgabe 1 b
    // =================================================================================================================
    public static void a() {
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

    // =================================================================================================================
    // Aufgabe 1 b
    // =================================================================================================================
    public static void b() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Größe n des n x n Arrays ein: ");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = i + j + 1;
            }
        }

        System.out.println("Zweidimensionales Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
