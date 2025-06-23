package Praktikum.Praktikum_7;

import Praktikum.Praktikum_7.Aufgaben.Aufgabe_1.*;
import Praktikum.Praktikum_7.Aufgaben.Aufgabe_2.*;
import Praktikum.Praktikum_7.Aufgaben.Aufgabe_3.*;

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
        Top object = new Middle(5, 6);
        System.out.println(object.getResult());
        // Ausgabe: -1
    }

    public static void Aufgabe_1_b() {
        Top object = new Bottom(5, 6);
        System.out.println(object.getResult());
        // Ausgabe: -5
    }

    public static void Aufgabe_1_c() {
        Top object = new Top(5, 6);
        System.out.println(object.getResult());
        // Ausgabe: 11
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
    }
}
