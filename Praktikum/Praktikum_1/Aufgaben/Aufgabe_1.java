package Praktikum.Praktikum_1.Aufgaben;

public class Aufgabe_1 {
    public static void b_1() {
        int x = 5;
        int y = 3;
        float z = 3;
        int a = x - x * y;
        float b = x / y;
        float c = x / z;
        float d = x / (float) y;
        float e = (float) x / y;
        int f = (int) ((float) x / (float) y);
    }

    public static void b_2() {
        int a = 5;
        int b = a++;
        int c = a++ * --b;
        int d = a > b ? a : b;
    }

    public static void b_3() {
        int a = 10;
        int b = 20;

        if (a > b && ++a > --b) {
            System.out.println("Oha!");
        }
    }

    public static void b_4() {
        int x = 128;
        int y = 0b11101;
        int z = 0345;
        int w = 2;
        int a = x | y;
        int b = y & z;
        int c = x ^ z;
        int d = z >> w;
    }
}
