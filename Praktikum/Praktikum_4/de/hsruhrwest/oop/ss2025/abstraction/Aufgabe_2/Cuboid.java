package Praktikum.Praktikum_4.de.hsruhrwest.oop.ss2025.abstraction.Aufgabe_2;

public class Cuboid {
    private double length;
    private double width;
    private double height;

    public Cuboid() {
        this(1,1,1);
    }

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }

    public double getSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }
}
