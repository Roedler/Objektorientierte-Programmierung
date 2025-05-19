package Vorlesung;

public class Vorlesung_4 {
    public static void main(String[] args) {
        System.out.println(multipleTimes(43, 5));
        System.out.println(multipleTimes("hallo", 5));
    }

    public static String multipleTimes(int number, int n) {
        return String.valueOf(number).repeat(n);
    }

    public static String multipleTimes(String string, int n) {
        return String.valueOf(string).repeat(n);
    }
}
