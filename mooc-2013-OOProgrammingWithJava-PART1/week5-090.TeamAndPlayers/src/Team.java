import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> team;
  //private final int MAXTEAMSIZE = 16;     // team size limit of 16
    private int teamSize;                   // set max team size

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

    public int size() {
        return team.size();
    }

    public void addPlayer(Player player) {
        if (size() == 1 && teamSize == 2) {
            return;
        }
        if (size() < 16) {
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

    public void setMaxSize(int maxSize) {
        this.teamSize = (maxSize >= 16) ? 16 : maxSize;
    }

    public int goals() {
        int goals = 0;
        int i = 0;
        while (i < team.size()) {
            Player player = team.get(i);
            goals += player.goals();
            i++;
        }
        return goals;
    }

}
