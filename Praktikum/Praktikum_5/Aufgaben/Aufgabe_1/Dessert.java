package Praktikum.Praktikum_5.Aufgaben.Aufgabe_1;

class Dessert {
    private String name;
    private double price;
    private int calories;
    private String type;
    private boolean isVegan;

    public Dessert(String name, double price, int calories, String type, boolean isVegan) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.type = type;
        this.isVegan = isVegan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getIsVegan() {
        return isVegan;
    }

    public void setIsVegan(boolean isVegan) {
        this.isVegan = isVegan;
    }

    @Override
    public String toString() {
        return "Nachspeise: Name=" + name + ", Preis=" + price + "€, Kalorien=" + calories +
                ", Typ=" + type + ", Vegan=" + (isVegan ? "Ja" : "Nein");
    }
}
