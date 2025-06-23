package Praktikum.Praktikum_9.de.hsruhrwest.oop.ss2025.assignment9.Aufgabe_2;

import java.time.LocalDate;

public class User {
    private String name;
    private Profile profile;

    public User(String name, int totalPoints, LocalDate joinDate) {
        this.name = name;
        this.profile = new Profile(totalPoints, joinDate);
    }

    public String getName() {
        return name;
    }

    public Profile getProfile() {
        return profile;
    }

    public class Profile {
        private int totalPoints;
        private LocalDate joinDate;

        public Profile(int totalPoints, LocalDate joinDate) {
            this.totalPoints = totalPoints;
            this.joinDate = joinDate;
        }

        public int getTotalPoints() {
            return totalPoints;
        }

        public LocalDate getJoinDate() {
            return joinDate;
        }
    }
}
