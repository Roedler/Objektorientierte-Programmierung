package Vorlesung.Notizen.Aufgaben.Vorlesung_7;

public class Vektor3D<Type extends Number> {
    private Type x;
    private Type y;
    private Type z;


    public Vektor3D(Type x, Type y, Type z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vektor{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
