package Praktikum.Praktikum_6.Aufgaben.Aufgabe_2;

public class Reverser extends AbstractStringTransformer {

    @Override
    protected String transformString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
