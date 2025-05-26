package Praktikum.Praktikum_6.de.hsruhrwest.oop.ss2025.assignment6.Aufgabe_1;

public class MobilePhone extends KitchenDevice implements Electronic, BatteryPowered {
    private int batteryLife;
    private boolean hasInternetAccess;

    public MobilePhone(String name, int batteryLife, boolean hasInternetAccess) {
        super(name);
        this.batteryLife = batteryLife;
        this.hasInternetAccess = hasInternetAccess;
    }

    @Override
    public int getPowerConsumption() {
        return 15;
    }

    @Override
    public int getBatteryLife() {
        return batteryLife;
    }

    public boolean hasInternetAccess() {
        return hasInternetAccess;
    }
}
