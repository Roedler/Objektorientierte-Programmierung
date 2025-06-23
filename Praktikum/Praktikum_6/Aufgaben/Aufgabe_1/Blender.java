package Praktikum.Praktikum_6.Aufgaben.Aufgabe_1;

public class Blender extends KitchenDevice implements Electronic, DangerousDevice {
    private int bladeSpeed;

    public Blender(String name, int bladeSpeed) {
        super(name);
        this.bladeSpeed = bladeSpeed;
    }

    public int getBladeSpeed() {
        return bladeSpeed;
    }

    @Override
    public int getPowerConsumption() {
        return 600;
    }

    @Override
    public int getMinimumAge() {
        return 16;
    }
}
