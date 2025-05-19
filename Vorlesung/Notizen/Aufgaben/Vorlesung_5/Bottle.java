package Vorlesung.Notizen.Aufgaben.Vorlesung_5;

public class Bottle {
    public double volumeInLiter;

    public String color;

    public float fillLevel;

    public Bottle(double volumeInLiter, String color, float fillLevel) {
        this.volumeInLiter = volumeInLiter;
        this.color = color;
        this.fillLevel = fillLevel;
    }

    public boolean isEmpty() {
        return this.fillLevel == 0;
    }

    public void makeEmpty() {
        this.fillLevel = 0;
    }

    public void printCurrentAmountInLiter() {
        System.out.println("Current amount in liter: " + this.fillLevel * this.volumeInLiter);
    }
}
