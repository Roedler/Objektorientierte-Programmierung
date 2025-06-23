package Praktikum.Praktikum_6.Aufgaben.Aufgabe_1;

public class Toaster extends KitchenDevice implements Electronic, DangerousDevice {
    private int power;
    private boolean hasDefrostFunction;

    public Toaster(String name, int power, boolean hasDefrostFunction) {
        super(name);
        this.power = power;
        this.hasDefrostFunction = hasDefrostFunction;
    }

    public boolean hasDefrostFunction() {
        return hasDefrostFunction;
    }

    @Override
    public int getPowerConsumption() {
        return power;
    }

    @Override
    public int getMinimumAge() {
        return 12;
    }
}
