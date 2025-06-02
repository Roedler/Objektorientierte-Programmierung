package Praktikum.Praktikum_5.de.hsruhrwest.oop.ss2025.classes;

import Praktikum.Praktikum_5.de.hsruhrwest.oop.ss2025.classes.Aufgabe_1.*;
import Praktikum.Praktikum_5.de.hsruhrwest.oop.ss2025.classes.Aufgabe_2.*;

public class Praktikum_5 {
    public static void main(String[] args) {
//        Aufgabe_1();
        Aufgabe_2();
    }

    public static void Aufgabe_1() {
        PoliticalParty party = new PoliticalParty("Demo Partei", "DP", 2020, "Max Mustermann", new String[]{"Alice", "Bob", "Charlie"});
        System.out.println(party);
    }

    public static void Aufgabe_2() {
        WrittenExam written = new WrittenExam("Mathe-Klausur", 100, 60);
        InternshipExam internship = new InternshipExam("Praktikum Informatik", 10, 9);
        DrivingTheoryExam driving1 = new DrivingTheoryExam("Führerschein 1", new int[]{3, 3, 5});
        DrivingTheoryExam driving2 = new DrivingTheoryExam("Führerschein 2", new int[]{3, 3});
        BalloonExam balloon1 = new BalloonExam("Ballon 1", 3, false);
        BalloonExam balloon2 = new BalloonExam("Ballon 2", 1, true);

        Exam[] exams = {written, internship, driving1, driving2, balloon1, balloon2};
        ExamCollection collection = new ExamCollection(exams);

        System.out.println(collection);
    }
}
