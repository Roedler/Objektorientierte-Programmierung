package Praktikum.Praktikum_7.Aufgaben.Aufgabe_1;

public class Bottom extends Middle {
    public Bottom(int left, int right) {
        super(left, right);
    }

    @Override
    public int getResult() {
        return super.getLeft() * -1;
    }
}
