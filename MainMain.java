package module7;

import java.io.IOException;

public class MainMain {
    public static void main(String[] args) throws IOException {

        Game.writeNumOfPlayersPerTeam(Game.GameType.SOCCER);
        System.out.println();
        Game.writeNumOfPlayersPerTeam(Game.GameType.RUGBY);
        System.out.println();
        Game.writeNumOfPlayersPerTeam(Game.GameType.HOCKEY);
        System.out.println();
        Game.writeNumOfPlayersPerTeam(null);









    }
}
