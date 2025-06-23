package Praktikum.Praktikum_6.Aufgaben.Aufgabe_2;

public class SpaceRemover extends AbstractStringTransformer {

    @Override
    protected String transformString(String input) {
        return input.replace(" ", "");
    }
}
