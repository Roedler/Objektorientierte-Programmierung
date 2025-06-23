package Praktikum.Praktikum_9;

import Praktikum.Praktikum_9.Aufgaben.Aufgabe_1.*;
import Praktikum.Praktikum_9.Aufgaben.Aufgabe_2.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Praktikum_9 {
    public static void main(String[] args) {
//        aufgabe_1_a();
//        aufgabe_1_b();
//        aufgabe_1_c();
//        aufgabe_2_d();
        aufgabe_2_e();
    }

    public static void aufgabe_1_a() {
        System.out.println("\nTest 1: Konstruktor (5x3) und Standardinitialisierung (SOIL)");
        try {
            Landscape landscape1 = new Landscape(5, 3);
            landscape1.setTile(1, 0, Landscape.Tile.BEACH);
            landscape1.setTile(0, 1, Landscape.Tile.BEACH);
            landscape1.setTile(1, 1, Landscape.Tile.SOIL);
            landscape1.setTile(2, 1, Landscape.Tile.BEACH);
            landscape1.setTile(1, 2, Landscape.Tile.BEACH);
            System.out.println("Breite: " + landscape1.getWidth() + ", Höhe: " + landscape1.getHeight());
            System.out.println(landscape1);
        } catch (IllegalArgumentException e) {
            System.err.println("Fehler: " + e.getMessage());
        }
    }

    public static void aufgabe_1_b() {
        Landscape landscape = new Landscape(20, 9);
        landscape.setTile(1, 0, Landscape.Tile.BEACH);
        landscape.setTile(0, 1, Landscape.Tile.BEACH);
        landscape.setTile(1, 1, Landscape.Tile.SOIL);
        landscape.setTile(2, 1, Landscape.Tile.BEACH);
        landscape.setTile(1, 2, Landscape.Tile.BEACH);
        try (FileOutputStream fos = new FileOutputStream(Landscape.ABSOLUTE_PATH + "landscape.txt")) {
            landscape.writeLandscape(landscape, fos);
            System.out.println("Landschaft erfolgreich in landscape.txt geschrieben.");
        } catch (IOException e) {
            System.err.println("Fehler beim Schreiben der Landschaft: " + e.getMessage());
        }
    }

    public static void aufgabe_1_c() {
        try (FileInputStream fis = new FileInputStream(Landscape.ABSOLUTE_PATH + "landscape.txt")) {
            Landscape landscapeFromFile = Landscape.readLandscape(fis);
            System.out.println("Landschaft erfolgreich aus Datei gelesen:\n" + landscapeFromFile);
        } catch (IOException | InvalidFormatException e) {
            System.err.println("Fehler beim Lesen der Landschaft aus Datei: " + e.getMessage());
        }
    }

    public static void aufgabe_2_d() {
        List<User> users = new ArrayList<>();
        users.add(new User("Alice", 100, LocalDate.now().minusDays(50)));
        users.add(new User("Bob", 200, LocalDate.now().minusDays(150)));
        users.add(new User("Charlie", 350, LocalDate.now().minusDays(80)));

        System.out.println("Nutzer mit mindestens 300 Punkten:");
        UserPrinter.printMatchingUsers(users, new UserFilter() {
            public boolean matches(User user) {
                return user.getProfile().getTotalPoints() >= 300;
            }
        });

        System.out.println("\nNutzer, die seit maximal 100 Tagen Mitglied sind:");
        UserPrinter.printMatchingUsers(users, new UserFilter() {
            public boolean matches(User user) {
                return user.getProfile().getJoinDate().isAfter(LocalDate.now().minusDays(100));
            }
        });
    }

    public static void aufgabe_2_e() {
        List<User> users = new ArrayList<>();
        users.add(new User("Alice", 100, LocalDate.now().minusDays(50)));
        users.add(new User("Bob", 200, LocalDate.now().minusDays(150)));
        users.add(new User("Charlie", 350, LocalDate.now().minusDays(80)));

        System.out.println("Nutzer mit mindestens 300 Punkten:");
        UserPrinter.printMatchingUsers(users, user -> user.getProfile().getTotalPoints() >= 300);

        System.out.println("\nNutzer, die seit maximal 100 Tagen Mitglied sind:");
        UserPrinter.printMatchingUsers(users, user ->
                user.getProfile().getJoinDate().isAfter(LocalDate.now().minusDays(100)));
    }
}
