package Praktikum.Praktikum_7.Aufgaben.Aufgabe_1;

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
