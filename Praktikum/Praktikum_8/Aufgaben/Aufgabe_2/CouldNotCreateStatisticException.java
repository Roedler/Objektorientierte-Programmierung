package Praktikum.Praktikum_8.Aufgaben.Aufgabe_2;

public class CouldNotCreateStatisticException extends Exception {
    public CouldNotCreateStatisticException(Throwable cause) {
        super("Could not create statistic", cause);
    }
}
