package defaultconstructor.chess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChessTournament {
    private List<Team> teams;

    public ChessTournament() {
        this.teams = Arrays.asList(new Team(), new Team(), new Team());
    }

    public void addPlayersToTeams(List<Player> registratedPlayers) {
        for (int i = 0; i < teams.size() * 2; i++) {
            setPlayers(i, registratedPlayers);
        }
    }

    public void setPlayers(int i, List<Player> registratedPlayers) {
        if (registratedPlayers.size() >= i + 1) {
            if (i % 2 == 0) {
                teams.get(i / 2).setPlayerOne(registratedPlayers.get(i));
            }
            else {
                teams.get(i / 2).setPlayerTwo(registratedPlayers.get(i));
            }
        }
    }

    public List<Team> getTeams() {
        return teams;
    }
}