package Praktikum.Praktikum_1.Aufgaben;

public class Aufgabe_2 {
    public Aufgabe_2() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Geben Sie die untere Grenze a ein (1 bis 10000): ");
        int a = scanner.nextInt();

        System.out.print("Geben Sie die obere Grenze b ein (1 bis 10000): ");
        int b = scanner.nextInt();

        if (a < 1 || a > 10000 || b < 1 || b > 10000) {
            System.out.println("Fehler: a und b müssen zwischen 1 und 10000 liegen.");
            scanner.close();
            return;
        }

        if (a >= b) {
            System.out.println("Fehler: a muss kleiner als b sein.");
            scanner.close();
            return;
        }

        System.out.println("Quadratzahlen im Intervall [" + a + ", " + b + "]:");
        boolean firstReturn = true;
        for (int i = 1; i * i <= b; i++) {
            int sqaure = i * i;
            if (sqaure >= a) {
                if (!firstReturn) {
                    System.out.print(", ");
                }
                System.out.print(sqaure);
                firstReturn = false;
            }
        }
//		System.out.println();

        scanner.close();
    }
}
