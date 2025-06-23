package Praktikum.Praktikum_6.Aufgaben.Aufgabe_1;

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
