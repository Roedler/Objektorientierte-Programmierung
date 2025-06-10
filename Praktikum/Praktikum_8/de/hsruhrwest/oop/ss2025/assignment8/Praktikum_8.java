package Praktikum.Praktikum_8.de.hsruhrwest.oop.ss2025.assignment8;

import Praktikum.Praktikum_1.Aufgaben.Aufgabe_2;
import Praktikum.Praktikum_8.de.hsruhrwest.oop.ss2025.assignment8.Aufgabe_1.*;
import Praktikum.Praktikum_8.de.hsruhrwest.oop.ss2025.assignment8.Aufgabe_2.*;

import java.util.List;

public class Praktikum_8 {
    public static void main(String[] args) {
//        Aufgabe_1();
//        Aufgabe_2_b();
        try {
            Aufgabe_2_c();
        } catch (CouldNotCreateStatisticException e) {
            throw new RuntimeException(e);
        }
    }

    public static void Aufgabe_1() {
        MusicGenre genre = MusicGenre.ROCK;
        City city = City.COLOGNE;
        LearningModule module = LearningModule.OOP;

        System.out.println("Musikgenre: " + genre);
        System.out.println("Stadt: " + city.getName() + city.getPopulation());
        System.out.println("Lernmodul: " + module.getId() + " - " + module.getModuleName());
    }

    public static void Aufgabe_2_a() {
        // Geprüfte Ausnahmen (checked) werden zur Kompilierzeit geprüft und müssen abgefangen oder deklariert werden
        // (erben von Exception). Ungeprüfte Ausnahmen (unchecked) treten zur Laufzeit auf und müssen nicht behandelt
        // werden (erben von RuntimeException).

        // Geprüfte: Klasse erbt von Exception.
        // Ungeprüfte: Klasse erbt von RuntimeException

        // Geprüfte: Muss mit try-catch abgefangen oder per throw deklariert werden, sonst kommt ein Kompilierfehler.
        // Ungeprüfte: Kann abgefangen werden, ist aber optional.
    }

    public static void Aufgabe_2_b() {
        Person person1 = new Person("Lennart", 23, Gender.MALE);
        Person person2 = new Person("Karina", 25, Gender.FEMALE);

        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
    }

    public static void Aufgabe_2_c() throws CouldNotCreateStatisticException, IllegalArgumentException {
        Person person1 = new Person("Lennart", 23, Gender.MALE);
        Person person2 = new Person("Karina", 25, Gender.FEMALE);
        Person person3 = new Person("Levin", 20, Gender.MALE);
        Person person4 = new Person("Hanna", 20, Gender.FEMALE);

        PersonStatistics statistics = new PersonStatistics(List.of(person1, person2, person3, person4));

        try {
            statistics.printYoungestAndOldestPerson();
        } catch (CouldNotCreateStatisticException | IllegalArgumentException e) {
            System.err.println("Fehler beim Erstellen der Statistik: " + e.getMessage());
        }
    }

}
