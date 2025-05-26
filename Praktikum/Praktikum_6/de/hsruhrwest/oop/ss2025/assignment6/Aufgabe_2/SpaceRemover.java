package Praktikum.Praktikum_6.de.hsruhrwest.oop.ss2025.assignment6.Aufgabe_2;

public class SpaceRemover extends AbstractStringTransformer {

    @Override
    protected String transformString(String input) {
        return input.replace(" ", "");
    }
}
