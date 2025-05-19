package Praktikum.Praktikum_4.de.hsruhrwest.oop.ss2025.abstraction.Aufgabe_2;

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder() {}

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}
