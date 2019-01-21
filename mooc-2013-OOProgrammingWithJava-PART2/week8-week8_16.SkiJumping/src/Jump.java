import java.util.ArrayList;
import java.util.Random;

public class Jump {
    private ArrayList<Integer> distance;
    private ArrayList<Integer> votes;
    private int points;
    //private Random randDist;
    //private Random randVotes;

    public Jump() {
        this.distance = new ArrayList<Integer>();
        this.votes = new ArrayList<Integer>();
        this.points = 0;
    }

    public void add() {
        Random dist = new Random();
        int randDistance = dist.nextInt(120) + 60;
        this.distance.add(randDistance);
    }

    public int getPoints() {
        return points;
    }
}