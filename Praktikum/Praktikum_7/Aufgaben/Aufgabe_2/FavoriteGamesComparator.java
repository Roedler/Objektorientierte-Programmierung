package Praktikum.Praktikum_7.Aufgaben.Aufgabe_2;

import java.util.Comparator;

public class FavoriteGamesComparator implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        return Integer.compare(p1.getFavoriteGames().size(), p2.getFavoriteGames().size());
    }
}
