package Vorlesung;

public class Vorlesung_3 {
    public static void main(String[] args) {
//        uebung1();
        uebung2(100);
    }

    public static void uebung1() {

    }

    public static void uebung2(int arrayLength) {
        boolean[] array = new boolean[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println(i + " " + (array[i] = i % 2 == 0));
        }
    }
}
