package Praktikum.Praktikum_8.Aufgaben.Aufgabe_1;

public enum City {
    BERLIN("Berlin", 3_669_491),
    HAMBURG("Hamburg", 1_847_253),
    MUNICH("München", 1_588_613),
    COLOGNE("Köln", 1_087_863),
    FRANKFURT("Frankfurt am Main", 763_380);

    private final String name;
    private final int population;

    City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }
}
