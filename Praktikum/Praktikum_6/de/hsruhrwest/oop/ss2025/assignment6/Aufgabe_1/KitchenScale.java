package Praktikum.Praktikum_6.de.hsruhrwest.oop.ss2025.assignment6.Aufgabe_1;

public class KitchenScale extends KitchenDevice implements BatteryPowered {
    private int maxWeight;

    public KitchenScale(String name, int maxWeight) {
        super(name);
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    @Override
    public int getBatteryLife() {
        return 200;
    }
}
