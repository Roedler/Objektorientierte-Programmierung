package Praktikum.Praktikum_8.de.hsruhrwest.oop.ss2025.assignment8.Aufgabe_2;

public class NonUniquePersonFoundException extends Exception {
    private int age;

    public NonUniquePersonFoundException(int age) {
        super("Multiple persons found with age: " + age);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
