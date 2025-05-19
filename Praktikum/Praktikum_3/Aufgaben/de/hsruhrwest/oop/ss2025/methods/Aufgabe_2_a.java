package Praktikum.Praktikum_3.Aufgaben.de.hsruhrwest.oop.ss2025.methods;

import java.util.Scanner;

public class Aufgabe_2_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie die erste Zahl ein: ");
        int x = scanner.nextInt();
        System.out.print("Bitte geben Sie die zweite Zahl ein: ");
        int y = scanner.nextInt();

        System.out.println("Das Ergebnis des Polynoms ist: " + polynom(x,y));
    }

    public static int polynom(int x, int y) {
        return 9*x^2 - 2*x^3 + y;
    }
}
