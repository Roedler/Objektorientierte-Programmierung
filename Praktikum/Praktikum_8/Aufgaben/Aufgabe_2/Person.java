package Praktikum.Praktikum_8.Aufgaben.Aufgabe_2;

public class Person {
    private final String name;
    private final int age;
    private final Gender gender;

    public Person(String name, int age, Gender gender) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must not be null or empty");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age must not be negative");
        }
        if (gender == null) {
            throw new IllegalArgumentException("Gender must not be null");
        }
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", gender=" + gender + "}";
    }
}
