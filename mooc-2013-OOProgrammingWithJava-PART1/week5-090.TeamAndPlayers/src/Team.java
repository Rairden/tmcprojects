import java.util.ArrayList;

// TEST

public class Team {
    private String teamName;
    private ArrayList<Player> team;
    private final int MAXTEAMSIZE = 16;
    private int teamSize;
    private int goals;

    public Team() {
        this.teamName = teamName;
    }

    public Team(String str) {
        this.teamName = str;
        this.team = new ArrayList<Player>();
    }

    public String getName() {
        return teamName;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void addPlayer(Player player) {
        if (team.size() <= MAXTEAMSIZE) {
            team.add(player);
            teamSize++;
        }
    }

    public void printPlayers() {
        int i = 0;
        while (i < team.size()) {
            System.out.println(team.get(i));
            i++;
        }
    }

    public void setMaxSize(int teamSize) {
        this.teamSize = (teamSize >= MAXTEAMSIZE) ? MAXTEAMSIZE : teamSize;
    }

    public int teamGoals() {

        int i = 0;
        while (i < team.size()) {
            Player player = team.get(i);
            goals += player.getPlayerGoals();
            i++;
        }
        return goals;
    }

}
