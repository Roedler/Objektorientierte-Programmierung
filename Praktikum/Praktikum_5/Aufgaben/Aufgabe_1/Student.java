package Praktikum.Praktikum_5.Aufgaben.Aufgabe_1;

class Student {
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private String major;

    public Student(String id, String firstName, String lastName, int age, String major) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Studierender: ID=" + id + ", Vorname=" + firstName + ", Nachname=" + lastName +
                ", Alter=" + age + ", Studiengang=" + major;
    }
}
