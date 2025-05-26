package Praktikum.Praktikum_6.de.hsruhrwest.oop.ss2025.assignment6.Aufgabe_1;

public class Bowl extends KitchenDevice {
    private double volume;

    public Bowl(String name, double volume) {
        super(name);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
