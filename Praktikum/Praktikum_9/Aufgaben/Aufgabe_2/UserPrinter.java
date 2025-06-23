package Praktikum.Praktikum_9.Aufgaben.Aufgabe_2;

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
