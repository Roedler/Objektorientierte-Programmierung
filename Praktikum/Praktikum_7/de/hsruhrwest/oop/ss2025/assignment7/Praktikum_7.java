package Praktikum.Praktikum_7.de.hsruhrwest.oop.ss2025.assignment7;

import Praktikum.Praktikum_7.de.hsruhrwest.oop.ss2025.assignment7.Aufgabe_1.*;
import Praktikum.Praktikum_7.de.hsruhrwest.oop.ss2025.assignment7.Aufgabe_2.*;
import Praktikum.Praktikum_7.de.hsruhrwest.oop.ss2025.assignment7.Aufgabe_3.*;

import java.util.*;

public class Praktikum_7 {
    public static void main(String[] args) {
//        Aufgabe_1_a();
//        Aufgabe_1_b();
//        Aufgabe_1_c();
//        Aufgabe_2();
        Aufgabe_3();
    }

    public static void Aufgabe_1_a() {
        // Deklaration: Die Referenz object ist vom Typ Top, aber das tatsächliche Objekt ist vom Typ Middle.
        // Konstruktor: Middle(5, 6) ruft Top(5, 6) auf, also ist left = 5 und right = 6.
        // Dynamisches Binding: Bei object.getResult() wird die Methode getResult()
        // der Klasse Middle aufgerufen, da das tatsächliche Objekt ein Middle-Objekt ist.
        // Berechnung: In Middle gibt getResult() den Wert left - right = 5 - 6 = -1 zurück.
        // Ausgabe: -1

        Top object = new Middle(5, 6);
        System.out.println(object.getResult());
    }

    public static void Aufgabe_1_b() {
        // Deklaration: Die Referenz object ist vom Typ Top, aber das tatsächliche Objekt ist vom Typ Bottom.
        // Konstruktor: Bottom(5, 6) ruft Middle(5, 6) auf, welches wiederum Top(5, 6) aufruft, also ist left = 5
        // und right = 6.
        // Dynamisches Binding: Bei object.getResult() wird die Methode getResult() der Klasse Bottom aufgerufen,
        // da das tatsächliche Objekt ein Bottom-Objekt ist.
        // Berechnung: In Bottom gibt getResult() den Wert super.getLeft() * -1 zurück. super.getLeft() ruft
        // getLeft() von Top auf, was 5 ergibt. Daher ist das Ergebnis 5 * -1 = -5.
        // Ausgabe: -5

        Top object = new Bottom(5, 6);
        System.out.println(object.getResult());
    }

    public static void Aufgabe_1_c() {
        // Deklaration: Die Referenz object ist vom Typ Top, und das tatsächliche Objekt ist ebenfalls vom Typ Top.
        // Konstruktor: Top(5, 6) setzt left = 5 und right = 6.
        // Dynamisches Binding: Bei object.getResult() wird die Methode getResult() der Klasse Top aufgerufen, da das tatsächliche Objekt ein Top-Objekt ist.
        // Berechnung: In Top gibt getResult() den Wert left + right = 5 + 6 = 11 zurück.
        // Ausgabe: 11

        Top object = new Top(5, 6);
        System.out.println(object.getResult());
    }

    public static void Aufgabe_2() {
        PlayerDatabase db = getPlayerDatabase();

        System.out.println("Alle Spieler:");
        for (Player p : db.getAllPlayers()) {
            System.out.println(p);
        }

        System.out.println("\nSpieler nach Punktzahl sortiert:");
        db.sortByScore();
        for (Player p : db.getAllPlayers()) {
            System.out.println(p);
        }

        System.out.println("\nSpieler nach Anzahl der Lieblingsspiele sortiert:");
        db.sortByFavoriteGamesCount();
        for (Player p : db.getAllPlayers()) {
            System.out.println(p);
        }

        System.out.println("\nSpieler, die Tetris mögen:");
        Set<Player> tetrisPlayers = db.getPlayersByFavoriteGame("Tetris");
        for (Player p : tetrisPlayers) {
            System.out.println(p);
        }

        System.out.println("\nSpiel-Histogramm:");
        Map<String, Long> histogram = db.getGameHistogram();
        for (Map.Entry<String, Long> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nLösche Spieler mit 'Ali' im Namen");
        db.deletePlayersByName("Ali");
        System.out.println("Verbleibende Spieler:");
        for (Player p : db.getAllPlayers()) {
            System.out.println(p);
        }
    }

    private static PlayerDatabase getPlayerDatabase() {
        PlayerDatabase db = new PlayerDatabase();

        Player p1 = new Player("Alice", 100, new HashSet<>(Arrays.asList("Minecraft", "Tetris")));
        Player p2 = new Player("Bob", 150, new HashSet<>(Arrays.asList("Tetris", "Chess", "Portal")));
        Player p3 = new Player("Charlie", 120, new HashSet<>(Collections.singletonList("Chess")));
        Player p4 = new Player("Alicia", 80, new HashSet<>(Arrays.asList("Minecraft", "Portal")));

        db.addPlayer(p1);
        db.addPlayer(p2);
        db.addPlayer(p3);
        db.addPlayer(p4);
        return db;
    }

    public static void Aufgabe_3() {
        var set1 = new HashSet<Person>();
        set1.add(new Person("Bob"));
        set1.add(new Person("Bob"));
        System.out.println("Size of set: " + set1.size());

        var set2 = new HashSet<PersonCorrected>();
        set2.add(new PersonCorrected("Bob"));
        set2.add(new PersonCorrected("Bob"));
        System.out.println("Size of set: " + set2.size());
    }
}
