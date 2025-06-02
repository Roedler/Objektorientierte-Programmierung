package Praktikum.Praktikum_7.de.hsruhrwest.oop.ss2025.assignment7.Aufgabe_3;

import java.util.Objects;

public class PersonCorrected {
    private String name;

    public PersonCorrected(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonCorrected person = (PersonCorrected) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
