package Praktikum.Praktikum_6.de.hsruhrwest.oop.ss2025.assignment6.Aufgabe_4;

import java.util.HashMap;
import java.util.Map;

public class Statistic<T> {

    private T mostCommon;
    private T leastCommon;

    public Statistic(T mostCommon, T leastCommon) {
        this.mostCommon = mostCommon;
        this.leastCommon = leastCommon;
    }

    public T getMostCommon() {
        return this.mostCommon;
    }

    public T getLeastCommon() {
        return this.leastCommon;
    }

    @Override
    public String toString() {
        return "Häufigstes Element: " + this.mostCommon + ", Seltenstes Element: " + this.leastCommon;
    }

    public static <T> Statistic<T> getArrayStatistic(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        Map<T, Integer> frequencyMap = new HashMap<>();
        for (T element : array) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        T mostCommon = null;
        T leastCommon = null;
        int maxCount = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;

        for (Map.Entry<T, Integer> entry : frequencyMap.entrySet()) {
            int count = entry.getValue();
            if (count > maxCount) {
                maxCount = count;
                mostCommon = entry.getKey();
            }
            if (count < minCount) {
                minCount = count;
                leastCommon = entry.getKey();
            }
        }

        return new Statistic<>(mostCommon, leastCommon);
    }
}
