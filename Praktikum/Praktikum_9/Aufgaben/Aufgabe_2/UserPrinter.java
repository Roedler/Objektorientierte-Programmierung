package Praktikum.Praktikum_9.Aufgaben.Aufgabe_2;

import java.util.List;

/**
 * Provides methods to print user details that match a given filter.
 */
public class UserPrinter {

    /**
     * Prints details of users from the provided list who match the specified filter.
     * The output includes the user's name, total points, and join date in German.
     *
     * @param users  The list of users to filter and print.
     * @param filter The filter to apply to determine which users to print.
     */
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
