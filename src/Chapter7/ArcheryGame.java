package Chapter7;

public class ArcheryGame {
    private Player[] players;
    public ArcheryGame(int numOfArchers){
        players = new Player[numOfArchers];
        addPlayer(numOfArchers);
    }
    public Player[] getPlayers() {
        return players;
    }
    private void addPlayer(int numOfArcher){
        for (int i = 0; i < numOfArcher; i++) {
            players[i] = new Player();

        }
    }

}
