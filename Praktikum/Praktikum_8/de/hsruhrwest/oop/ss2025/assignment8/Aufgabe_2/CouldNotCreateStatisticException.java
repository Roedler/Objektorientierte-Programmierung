package Praktikum.Praktikum_8.de.hsruhrwest.oop.ss2025.assignment8.Aufgabe_2;

public class CouldNotCreateStatisticException extends Exception {
    public CouldNotCreateStatisticException(Throwable cause) {
        super("Could not create statistic", cause);
    }
}
