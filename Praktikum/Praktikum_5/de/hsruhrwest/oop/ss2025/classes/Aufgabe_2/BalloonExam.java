package Praktikum.Praktikum_5.de.hsruhrwest.oop.ss2025.classes.Aufgabe_2;

public final class BalloonExam extends Exam {
    private int volume;
    private boolean isPopped;

    public BalloonExam(String name, int volume, boolean isPopped) {
        super(name);
        this.isPopped = isPopped;
        this.volume = isPopped ? 0 : (volume > 0 ? volume : 1);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = isPopped ? 0 : (volume > 0 ? volume : 1);
    }

    public boolean getIsPopped() {
        return isPopped;
    }

    public void setIsPopped(boolean isPopped) {
        this.isPopped = isPopped;
        if (isPopped) {
            this.volume = 0;
        }
    }

    @Override
    public boolean isPassed() {
        return !isPopped && volume >= 2;
    }

    @Override
    public String toString() {
        return "Luftballonprüfung: Name=" + getName() + ", Volumen=" + volume +
                ", Geplatzt=" + (isPopped ? "Ja" : "Nein") + ", Bestanden=" + (isPassed() ? "Ja" : "Nein");
    }
}
