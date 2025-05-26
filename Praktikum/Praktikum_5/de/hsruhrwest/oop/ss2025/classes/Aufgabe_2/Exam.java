package Praktikum.Praktikum_5.de.hsruhrwest.oop.ss2025.classes.Aufgabe_2;

public abstract class Exam {
    private String name;

    public Exam(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean isPassed();

    @Override
    public String toString() {
        return "Prüfung: Name=" + name + ", Bestanden=" + (isPassed() ? "Ja" : "Nein");
    }
}
