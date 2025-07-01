package Vorlesung.Notizen.Aufgaben.Vorlesung_12;

import java.util.Arrays;
import java.util.List;

public class Vorlesung_12 {

    public static void main(String[] args) {
        aufgabe_1();
    }

    public static void aufgabe_1() {
        List<Student> students = Arrays.asList(
                new Student("Alice", 89),
                new Student("bob", 50),
                new Student("charles", 120),
                new Student("david", 190)
        );

        double averageGrade = students.stream()
                .filter(s -> s.getGrade() >= 0 && s.getGrade() <= 100)
                .mapToInt(Student::getGrade)
                .average()
                .orElse(0.0);

        System.out.println("Average grade: " + averageGrade);
    }

}
