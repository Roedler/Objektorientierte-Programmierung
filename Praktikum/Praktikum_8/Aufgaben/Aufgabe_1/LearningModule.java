package Praktikum.Praktikum_8.Aufgaben.Aufgabe_1;

public enum LearningModule {
    OOP("OOP", "Objektorientierte Programmierung"),
    IM("IM", "Ingenieurmathematik"),
    UXD("UXD", "UX-Design"),
    DB("DB", "Datenbanken");

    private final String id;
    private final String moduleName;

    LearningModule(String id, String moduleName) {
        this.id = id;
        this.moduleName = moduleName;
    }

    public String getId() {
        return id;
    }

    public String getModuleName() {
        return moduleName;
    }
}
