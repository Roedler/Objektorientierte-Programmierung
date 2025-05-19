package Praktikum.Praktikum_1.Aufgaben;

public class Aufgabe_1_b_3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if(a > b && ++a > --b) {
            System.out.println("Oha!");
        }
    }
}
