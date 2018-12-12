public class Player {

    private String playerName;
    private int playerGoals;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public Player(String playerName, int playerGoals) {
        this.playerName = playerName;
        this.playerGoals = playerGoals;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerGoals() {
        int goals = 0;
        goals += playerGoals;
        return playerGoals;
    }

    public String toString() {
        return playerName + ", goals " + playerGoals;
    }

}
