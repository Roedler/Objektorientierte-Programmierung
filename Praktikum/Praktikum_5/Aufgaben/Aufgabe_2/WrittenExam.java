package Praktikum.Praktikum_5.Aufgaben.Aufgabe_2;

public class WrittenExam extends Exam {
    private int totalPoints;
    private int achievedPoints;

    public WrittenExam(String name, int totalPoints, int achievedPoints) {
        super(name);
        this.totalPoints = totalPoints;
        this.achievedPoints = achievedPoints;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getAchievedPoints() {
        return achievedPoints;
    }

    public void setAchievedPoints(int achievedPoints) {
        this.achievedPoints = achievedPoints;
    }

    @Override
    public boolean isPassed() {
        return achievedPoints >= totalPoints / 2;
    }

    @Override
    public String toString() {
        return "Klausur: Name=" + getName() + ", Gesamtpunkte=" + totalPoints +
                ", Erreichte Punkte=" + achievedPoints + ", Bestanden=" + (isPassed() ? "Ja" : "Nein");
    }
}
