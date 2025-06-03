package Praktikum.Praktikum_7.de.hsruhrwest.oop.ss2025.assignment7.Aufgabe_2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Player implements Comparable<Player> {
    private String name;
    private int score;
    private Set<String> favoriteGames;

    public Player(String name, int score, Set<String> favoriteGames) {
        this.name = name;
        this.score = score;
        this.favoriteGames = new HashSet<>(favoriteGames); // Defensive Kopie
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Set<String> getFavoriteGames() {
        return new HashSet<>(favoriteGames);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setFavoriteGames(Set<String> favoriteGames) {
        this.favoriteGames = new HashSet<>(favoriteGames);
    }

    @Override
    public String toString() {
        return "Player{name='" + name + "', score=" + score + ", favoriteGames=" + favoriteGames + "}";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Player player = (Player) object;
        return score == player.score &&
                Objects.equals(name, player.name) &&
                Objects.equals(favoriteGames, player.favoriteGames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score, favoriteGames);
    }

    @Override
    public int compareTo(Player other) {
        return Integer.compare(this.score, other.score);
    }
}
