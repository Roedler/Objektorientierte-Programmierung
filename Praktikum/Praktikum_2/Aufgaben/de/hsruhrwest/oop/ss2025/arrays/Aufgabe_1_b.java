package Praktikum.Praktikum_2.Aufgaben.de.hsruhrwest.oop.ss2025.arrays;

import java.util.Scanner;

public class Aufgabe_1_b {
    public static void main(String[] args) {
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
