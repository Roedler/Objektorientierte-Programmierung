package Praktikum.Praktikum_3.Aufgaben;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe_2 {

    // =================================================================================================================
    // Aufgabe 2 a
    // =================================================================================================================
    public static void a() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie die erste Zahl ein: ");
        int x = scanner.nextInt();
        System.out.print("Bitte geben Sie die zweite Zahl ein: ");
        int y = scanner.nextInt();

        System.out.println("Das Ergebnis des Polynoms ist: " + polynom(x, y));
    }

    public static int polynom(int x, int y) {
        return 9 * x ^ 2 - 2 * x ^ 3 + y;
    }

    // =================================================================================================================
    // Aufgabe 2 b
    // =================================================================================================================
    public static void b() {
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

    // =================================================================================================================
    // Aufgabe 2 c
    // =================================================================================================================
    public static void c() {
        String testString = "Hallo";
        long testNumber = 1273;

        System.out.println("Original String: " + testString);
        System.out.println("Reversed String: " + reverse(testString));
        System.out.println("Original Number: " + testNumber);
        System.out.println("Reversed Number: " + reverse(testNumber));
    }

    public static String reverse(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static long reverse(long input) {
        StringBuilder reversed = new StringBuilder(String.valueOf(input));
        return Long.parseLong(reversed.reverse().toString());
    }

    // =================================================================================================================
    // Aufgabe 2 d
    // =================================================================================================================
    public static void d() {
        System.out.println(Arrays.toString(test("100")));
        System.out.println(Arrays.toString(test("100", "20")));
    }

    public static long[] test(String... string) {
        long[] result = new long[string.length];
        for (int i = 0; i < string.length; i++) {
            result[i] = Long.parseLong(string[i]);
        }

        return result;
    }

    // =================================================================================================================
    // Aufgabe 2 e
    // =================================================================================================================
    public static void e() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie einen Satz ein: ");
        String sentence = scanner.nextLine();

        parseSentence(sentence);
    }

    public static void parseSentence(String sentence) {
        String regex = "-?\\d*\\.?\\d+";
        System.out.println("Alle Worte:");
        for (String word : sentence.split(" ")) {
            if (!word.matches(regex)) {
                System.out.println("\t" + word);
            }
        }

        System.out.println("Alle Zahlen:");
        for (String number : sentence.split(" ")) {
            if (number.matches(regex)) {
                System.out.println("\t" + number);
            }
        }
    }
}
