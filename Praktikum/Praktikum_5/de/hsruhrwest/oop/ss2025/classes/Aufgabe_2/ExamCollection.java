package Praktikum.Praktikum_5.de.hsruhrwest.oop.ss2025.classes.Aufgabe_2;

public class ExamCollection {
    private Exam[] exams;
    private final int maxExams = 100;
    private int examCount;

    public ExamCollection(Exam[] exams) {
        int maxExams = 100;
        this.exams = new Exam[maxExams];
        this.examCount = 0;
        for (int i = 0; i < maxExams && exams[i] != null; i++) {
            this.exams[i] = exams[i];
            this.examCount++;
        }
    }

    public Exam[] getExams() {
        Exam[] result = new Exam[examCount];
        for (int i = 0; i < examCount; i++) {
            result[i] = exams[i];
        }
        return result;
    }

    public int getPassedCount() {
        int count = 0;
        for (int i = 0; i < examCount; i++) {
            if (exams[i].isPassed()) {
                count++;
            }
        }
        return count;
    }

    public double getPassRate() {
        if (examCount == 0) return 0.0;
        return (double) getPassedCount() / examCount * 100;
    }

    public int getDrivingExamAttempts() {
        int attempts = 0;
        for (int i = 0; i < examCount; i++) {
            if (exams[i] instanceof DrivingTheoryExam) {
                attempts++;
                if (exams[i].isPassed()) {
                    return attempts;
                }
            }
        }
        return 0;
    }

    public int getPoppedBalloons() {
        int count = 0;
        for (int i = 0; i < examCount; i++) {
            if (exams[i] instanceof BalloonExam && ((BalloonExam) exams[i]).getIsPopped()) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Prüfungssammlung:\n");
        for (int i = 0; i < examCount; i++) {
            result.append(exams[i].toString()).append("\n");
        }
        result.append("Bestandene Prüfungen: ").append(getPassedCount()).append("\n");
        result.append("Bestehensquote: ").append(String.format("%.2f%%", getPassRate())).append("\n");
        result.append("Führerscheinprüfungsversuche: ").append(getDrivingExamAttempts()).append("\n");
        result.append("Geplatzte Luftballons: ").append(getPoppedBalloons());
        return result.toString();
    }
}
