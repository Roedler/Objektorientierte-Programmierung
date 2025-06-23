package Praktikum.Praktikum_1;

public class Aufgabe_3 {
    public Aufgabe_3() {
        final double EUR_TO_USD = 1.10;
        final double EUR_TO_GBP = 0.85;

        final double USD_TO_EUR = 0.91;
        final double USD_TO_GBP = 0.77;

        final double GBP_TO_EUR = 1.18;
        final double GBP_TO_USD = 1.30;

//		Scanner scanner = new Scanner(System.in);
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Wählen Sie die Quellwährung (EUR, USD, GBP):");
        String sourceCurrency = scanner.nextLine().toUpperCase();

        System.out.println("Wählen Sie die Zielwährung (EUR, USD, GBP):");
        String targetCurrency = scanner.nextLine().toUpperCase();

        System.out.println("Geben Sie den Betrag ein:");
        double amount = scanner.nextDouble();

        double result = 0.0;

        switch (sourceCurrency) {
            case "EUR":
                switch (targetCurrency) {
                    case "USD":
                        result = amount * EUR_TO_USD;
                        break;
                    case "GBP":
                        result = amount * EUR_TO_GBP;
                        break;
                    case "EUR":
                        result = amount;
                        break;
                    default:
                        System.out.println("Ungültige Zielwährung.");
                        return;
                }
                break;
            case "USD":
                switch (targetCurrency) {
                    case "EUR":
                        result = amount * USD_TO_EUR;
                        break;
                    case "GBP":
                        result = amount * USD_TO_GBP;
                        break;
                    case "USD":
                        result = amount;
                        break;
                    default:
                        System.out.println("Ungültige Zielwährung.");
                        return;
                }
                break;
            case "GBP":
                switch (targetCurrency) {
                    case "EUR":
                        result = amount * GBP_TO_EUR;
                        break;
                    case "USD":
                        result = amount * GBP_TO_USD;
                        break;
                    case "GBP":
                        result = amount;
                        break;
                    default:
                        System.out.println("Ungültige Zielwährung.");
                        return;
                }
                break;
            default:
                System.out.println("Ungültige Quellwährung.");
                return;
        }

        System.out.println(String.format("%.2f", amount) + " " + sourceCurrency + " = " + String.format("%.2f", result) + " " + targetCurrency);
    }
}
