package Praktikum.Praktikum_5.Aufgaben.Aufgabe_2;

public class DrivingTheoryExam extends Exam {
    private int[] errorPoints;
    private int errorCount;
    private final int MAX_ERRORS = 100;

    public DrivingTheoryExam(String name, int[] errorPoints) {
        super(name);
        this.errorPoints = new int[MAX_ERRORS];
        this.errorCount = 0;
        for (int i = 0; i < errorPoints.length && errorPoints[i] != 0; i++) {
            this.errorPoints[i] = errorPoints[i];
            this.errorCount++;
        }
    }

    public int[] getErrorPoints() {
        int[] result = new int[errorCount];
        for (int i = 0; i < errorCount; i++) {
            result[i] = errorPoints[i];
        }
        return result;
    }

    public void setErrorPoints(int[] errorPoints) {
        this.errorPoints = new int[MAX_ERRORS];
        this.errorCount = 0;
        for (int i = 0; i < MAX_ERRORS && errorPoints[i] != 0; i++) {
            this.errorPoints[i] = errorPoints[i];
            this.errorCount++;
        }
    }

    @Override
    public boolean isPassed() {
        int totalErrors = 0;
        int fivePointErrors = 0;
        for (int i = 0; i < errorCount; i++) {
            totalErrors += errorPoints[i];
            if (errorPoints[i] == 5) {
                fivePointErrors++;
            }
        }
        return totalErrors <= 10 && fivePointErrors < 2;
    }

    @Override
    public String toString() {
        StringBuilder errors = new StringBuilder("[");
        for (int i = 0; i < errorCount; i++) {
            errors.append(errorPoints[i]);
            if (i < errorCount - 1) {
                errors.append(", ");
            }
        }
        errors.append("]");
        return "Führerscheinprüfung: Name=" + getName() + ", Fehlerpunkte=" + errors.toString() +
                ", Bestanden=" + (isPassed() ? "Ja" : "Nein");
    }
}
