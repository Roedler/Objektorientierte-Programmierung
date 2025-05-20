package Praktikum.Praktikum_5.de.hsruhrwest.oop.ss2025.classes.Aufgabe_2;

public class InternshipExam extends Exam {
    private int totalSessions;
    private int attendedSessions;

    public InternshipExam(String name, int totalSessions, int attendedSessions) {
        super(name);
        this.totalSessions = totalSessions;
        this.attendedSessions = attendedSessions;
    }

    public int getTotalSessions() {
        return totalSessions;
    }

    public void setTotalSessions(int totalSessions) {
        this.totalSessions = totalSessions;
    }

    public int getAttendedSessions() {
        return attendedSessions;
    }

    public void setAttendedSessions(int attendedSessions) {
        this.attendedSessions = attendedSessions;
    }

    @Override
    public boolean isPassed() {
        return totalSessions - attendedSessions <= 2;
    }

    @Override
    public String toString() {
        return "Praktikum: Name=" + getName() + ", Gesamttermine=" + totalSessions +
                ", Besuchte Termine=" + attendedSessions + ", Bestanden=" + (isPassed() ? "Ja" : "Nein");
    }
}
