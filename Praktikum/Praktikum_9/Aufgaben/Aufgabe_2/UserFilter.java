package Praktikum.Praktikum_9.Aufgaben.Aufgabe_2;

/**
 * Defines a method to check if a user matches the filter criteria.
 */
public interface UserFilter {

    /**
     * Determines whether a given user matches the filter's criteria.
     *
     * @param user The user to evaluate against the filter.
     * @return true if the user matches the filter criteria, false otherwise.
     */
    boolean matches(User user);
}
