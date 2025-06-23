package Praktikum.Praktikum_4.Aufgaben.Aufgabe_4;

import java.time.LocalDate;

public class Employee {
    public static int ID = 1;
    private int id;
    private String name;
    private LocalDate birthDate;

    public Employee(String name, LocalDate birthDate) {
        this.id = ID++;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }
}
