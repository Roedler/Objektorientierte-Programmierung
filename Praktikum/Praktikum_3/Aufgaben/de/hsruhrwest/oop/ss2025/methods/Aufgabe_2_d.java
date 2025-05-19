package Praktikum.Praktikum_3.Aufgaben.de.hsruhrwest.oop.ss2025.methods;

import java.util.Arrays;

public class Aufgabe_2_d {
    public static void main(String[] args) {
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
}
