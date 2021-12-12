package defaultconstructor.chess;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChessTournamentTest {
    @Test
    void init() {
        ChessTournament chessTournament = new ChessTournament();
        assertEquals(3, chessTournament.getTeams().size());
    }

    @Test
    void testWithPlayers() {
        ChessTournament chessTournament = new ChessTournament();
        Player player1 = new Player();
        player1.setName("1st player");
        player1.setEmail("test1");
        Player player2 = new Player();
        player2.setName("2nd player");
        player2.setEmail("test2");
        Player player3 = new Player();
        player3.setName("3rd player");
        player3.setEmail("test3");
        Player player4 = new Player();
        player4.setName("4th player");
        player4.setEmail("test4");

        List<Player> playersList = Arrays.asList(player1, player2, player3, player4);
        chessTournament.addPlayersToTeams(playersList);
        assertEquals("2nd player", chessTournament.getTeams().get(0).getPlayerTwo().getName());
        assertEquals("test3", chessTournament.getTeams().get(1).getPlayerOne().getEmail());
    }
}