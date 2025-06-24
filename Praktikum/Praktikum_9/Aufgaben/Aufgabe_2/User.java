package Praktikum.Praktikum_9.Aufgaben.Aufgabe_2;

import java.time.LocalDate;

/**
 * The User class encapsulates a user's name and profile, including points and join date.
 */
public class User {
    private String name;     // The name of the user
    private Profile profile; // The profile associated with the user

    /**
     * Constructs a new User with the specified name, total points, and join date.
     *
     * @param name        The name of the user.
     * @param totalPoints The total points accumulated by the user.
     * @param joinDate    The date when the user joined.
     */
    public User(String name, int totalPoints, LocalDate joinDate) {
        this.name = name;
        this.profile = new Profile(totalPoints, joinDate);
    }

    /**
     * Returns the name of the user.
     *
     * @return The user's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the profile of the user.
     *
     * @return The user's profile.
     */
    public Profile getProfile() {
        return profile;
    }

    /**
     * An inner class representing the user's profile, containing points and join date.
     */
    public class Profile {
        private int totalPoints;      // The total points accumulated by the user
        private LocalDate joinDate;   // The date when the user joined

        /**
         * Constructs a new Profile with the specified total points and join date.
         *
         * @param totalPoints The total points accumulated by the user.
         * @param joinDate    The date when the user joined.
         */
        public Profile(int totalPoints, LocalDate joinDate) {
            this.totalPoints = totalPoints;
            this.joinDate = joinDate;
        }

        /**
         * Returns the total points accumulated by the user.
         *
         * @return The total points.
         */
        public int getTotalPoints() {
            return totalPoints;
        }

        /**
         * Returns the date when the user joined.
         *
         * @return The join date.
         */
        public LocalDate getJoinDate() {
            return joinDate;
        }
    }
}
