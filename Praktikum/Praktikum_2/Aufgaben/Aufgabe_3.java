package Praktikum.Praktikum_2.Aufgaben;

import java.util.Scanner;

public class Aufgabe_3 {
    private static final int INVENTORY_SIZE = 10;
    private final String[] inventory;
    private final Scanner scanner;

    public Aufgabe_3() {
        this.inventory = new String[INVENTORY_SIZE];
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            showMenu();
            int choice = this.scanner.nextInt();
            this.scanner.nextLine();

            switch (choice) {
                case 1:
                    listItems();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    removeItem();
                    break;
                case 4:
                    System.out.println("Programm beendet.");
                    this.scanner.close();
                    return;
                default:
                    System.out.println("Ungültige Eingabe!");
            }
        }
    }

    private void showMenu() {
        System.out.println("\nInventar-Menü:");
        System.out.println("1. Gegenstände auflisten");
        System.out.println("2. Gegenstand hinzufügen");
        System.out.println("3. Gegenstand entfernen");
        System.out.println("4. Programm beenden");
        System.out.print("Ihre Wahl: ");
    }

    private void listItems() {
        int freeSlots = 0;
        System.out.println("\nInventar-Inhalt:");
        for (int i = 0; i < INVENTORY_SIZE; i++) {
            if (this.inventory[i] == null) {
                freeSlots++;
                System.out.println("Slot " + (i + 1) + ": [Leer]");
            } else {
                System.out.println("Slot " + (i + 1) + ": " + this.inventory[i]);
            }
        }
        System.out.println("Freie Plätze: " + freeSlots);
    }

    private void addItem() {
        System.out.print("Name des Gegenstands: ");
        String item = this.scanner.nextLine();

        for (int i = 0; i < INVENTORY_SIZE; i++) {
            if (this.inventory[i] == null) {
                this.inventory[i] = item;
                System.out.println(item + " wurde hinzugefügt.");
                return;
            }
        }
        System.out.println("Fehler: Kein freier Platz im Inventar!");
    }

    private void removeItem() {
        System.out.print("Nummer des Slots (1-" + INVENTORY_SIZE + "): ");
        int slot = this.scanner.nextInt() - 1;
        this.scanner.nextLine();

        if (slot >= 0 && slot < INVENTORY_SIZE) {
            if (this.inventory[slot] != null) {
                this.inventory[slot] = null;
                System.out.println(this.inventory[slot] + " wurde entfernt.");
            } else {
                System.out.println("Fehler: Slot ist leer!");
            }
        } else {
            System.out.println("Fehler: Ungültige Slot-Nummer!");
        }
    }
}
