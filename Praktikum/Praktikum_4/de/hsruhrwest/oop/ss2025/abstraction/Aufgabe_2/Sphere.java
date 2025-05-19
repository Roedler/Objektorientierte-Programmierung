package Praktikum.Praktikum_4.de.hsruhrwest.oop.ss2025.abstraction.Aufgabe_2;

public class Sphere {
    private double radius;

    public Sphere() {}

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
