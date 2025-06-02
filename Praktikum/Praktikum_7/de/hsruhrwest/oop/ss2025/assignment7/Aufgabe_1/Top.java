package Praktikum.Praktikum_7.de.hsruhrwest.oop.ss2025.assignment7.Aufgabe_1;

public class Top {
    private int left;
    private int right;

    public Top(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    public int getResult() {
        return getLeft() + getRight();
    }
}
