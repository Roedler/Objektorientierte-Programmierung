package Praktikum.Praktikum_6.Aufgaben.Aufgabe_1;

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
