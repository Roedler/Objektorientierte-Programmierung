package Praktikum.Praktikum_3.Aufgaben.de.hsruhrwest.oop.ss2025.methods;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe_2_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Größe des Arrays an: ");
        int arraySize = scanner.nextInt();
        String[] array = new String[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Bitte geben Sie die: " + (i + 1) + ". Zahl ein: ");
            String input = scanner.next();
            array[i] = input;
        }

        System.out.println(Arrays.toString(extractPositiveNumbers(array)));
    }

    public static int[] extractPositiveNumbers(String[] array) {
        int positiveCount = 0;

        for (String string : array) {
            if (Integer.parseInt(string) >= 0) {
                positiveCount++;
            }
        }

        int[] result = new int[positiveCount];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(array[i]) >= 0) {
                result[index] = Integer.parseInt(array[i]);
                index++;
            }
        }

        return result;
    }
}
