package Praktikum.Praktikum_7.de.hsruhrwest.oop.ss2025.assignment7.Aufgabe_1;

public class Middle extends Top {
    public Middle(int left, int right) {
        super(left, right);
    }

    @Override
    public int getResult() {
        return getLeft() - getRight();
    }
}
