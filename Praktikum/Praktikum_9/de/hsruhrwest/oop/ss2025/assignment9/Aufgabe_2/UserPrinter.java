package Praktikum.Praktikum_9.de.hsruhrwest.oop.ss2025.assignment9.Aufgabe_2;

import java.util.List;

public class UserPrinter {
    public static void printMatchingUsers(List<User> users, UserFilter filter) {
        for (User user : users) {
            if (filter.matches(user)) {
                System.out.println("Nutzer: " + user.getName() + ", Punkte: " +
                        user.getProfile().getTotalPoints() + ", Mitglied seit: " +
                        user.getProfile().getJoinDate());
            }
        }
    }
}
