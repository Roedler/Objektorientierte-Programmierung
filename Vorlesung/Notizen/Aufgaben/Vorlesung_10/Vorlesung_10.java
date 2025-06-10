package Vorlesung.Notizen.Aufgaben.Vorlesung_10;

import java.util.ArrayList;

interface StringFunction {
    String run(String str);
}

public class Vorlesung_10 {
    public static void main(String[] args) {
//        name -> System.out.println("Hallo " + name);
//        (x, y) -> x > y ? x : y;
//        () -> System.out.println("Hallo Welt");
//        (value, name) -> name + " = " + value;

        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
