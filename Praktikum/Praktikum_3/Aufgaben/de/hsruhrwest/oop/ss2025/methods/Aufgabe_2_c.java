package Praktikum.Praktikum_3.Aufgaben.de.hsruhrwest.oop.ss2025.methods;

public class Aufgabe_2_c {
    public static void main(String[] args) {
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
}
