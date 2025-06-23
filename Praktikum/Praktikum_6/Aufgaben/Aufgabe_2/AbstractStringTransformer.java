package Praktikum.Praktikum_6.Aufgaben.Aufgabe_2;

public abstract class AbstractStringTransformer {

    public void transform(String... strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = transformString(strings[i]);
        }

        for (String s : strings) {
            System.out.println(s);
        }
    }

    protected abstract String transformString(String input);
}
