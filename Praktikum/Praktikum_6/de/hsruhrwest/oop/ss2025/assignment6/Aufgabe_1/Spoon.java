package Praktikum.Praktikum_6.de.hsruhrwest.oop.ss2025.assignment6.Aufgabe_1;

public class Spoon extends KitchenDevice {
    private String material;

    public Spoon(String name, String material) {
        super(name);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
