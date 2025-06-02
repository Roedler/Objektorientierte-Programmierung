package Praktikum.Praktikum_7.de.hsruhrwest.oop.ss2025.assignment7.Aufgabe_2;

import java.util.*;

public class PlayerDatabase {
    private List<Player> players;

    public PlayerDatabase() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public List<Player> getAllPlayers() {
        return new ArrayList<>(players);
    }

    public void deletePlayersByName(String searchString) {
        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()) {
            Player player = iterator.next();
            if (player.getName().contains(searchString)) {
                iterator.remove();
            }
        }
    }

    public Set<Player> getPlayersByFavoriteGame(String game) {
        Set<Player> result = new HashSet<>();
        for (Player player : players) {
            if (player.getFavoriteGames().contains(game)) {
                result.add(player);
            }
        }
        return result;
    }

    public void sortByScore() {
        Collections.sort(players);
    }

    public void sortByFavoriteGamesCount() {
        Collections.sort(players, new FavoriteGamesComparator());
    }

    public Map<String, Long> getGameHistogram() {
        Map<String, Long> histogram = new HashMap<>();
        for (Player player : players) {
            for (String game : player.getFavoriteGames()) {
                histogram.put(game, histogram.getOrDefault(game, 0L) + 1);
            }
        }
        return histogram;
    }
}
