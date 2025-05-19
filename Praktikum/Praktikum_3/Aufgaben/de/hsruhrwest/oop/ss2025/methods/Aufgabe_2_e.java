package Praktikum.Praktikum_3.Aufgaben.de.hsruhrwest.oop.ss2025.methods;

import java.util.Scanner;

public class Aufgabe_2_e {
    public static void main(String[] args) {
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
