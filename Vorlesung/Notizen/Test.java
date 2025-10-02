package Vorlesung.Notizen;

public class Test {
    public static void main(String[] args) {
        return teams.stream()
                .filter(team -> team.getPlayers().stream()
                        .flatMap(player -> player.getScrore().sum() >= minScore))
                .collect(Collectors.toList());
    }
}
