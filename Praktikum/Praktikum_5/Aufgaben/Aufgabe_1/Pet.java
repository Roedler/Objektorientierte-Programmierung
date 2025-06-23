package Praktikum.Praktikum_5.Aufgaben.Aufgabe_1;

class Pet {
    private String name;
    private String species;
    private int age;
    private String owner;
    private boolean vaccinated;

    public Pet(String name, String species, int age, String owner, boolean vaccinated) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.owner = owner;
        this.vaccinated = vaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return "Haustier: Name=" + name + ", Tierart=" + species + ", Alter=" + age +
                ", Besitzer=" + owner + ", Geimpft=" + (vaccinated ? "Ja" : "Nein");
    }
}
