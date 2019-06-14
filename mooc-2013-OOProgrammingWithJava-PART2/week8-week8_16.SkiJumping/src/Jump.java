import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Jump implements Comparable<Jump> {

    public ArrayList<Integer> distance;
    private ArrayList<Integer> votes;
    private ArrayList<Integer> tmpVotes;
    private String name;

    private int points;

    public Jump(String name) {
        distance = new ArrayList<>();
        votes    = new ArrayList<>();
        tmpVotes = new ArrayList<>();
        points   = 0;
        this.name = name;
    }

    void addJump() {
        Random dist = new Random();
        int randDistance = dist.nextInt(60) + 60;
        distance.add(randDistance);
    }

    void addVote(int numVotes) {
        for (int i = 0; i < numVotes; i++) {
            Random vote = new Random();
            int randVote = vote.nextInt(10) + 10;
            votes.add(randVote);
            tmpVotes.add(randVote);
        }
    }

    ArrayList<Integer> getTmpVotes() {
        return tmpVotes;
    }

    void calcPoints(int round) {
        Collections.sort(votes);
        for (int i = 5 * round - 4, k = i; i < k + 3; i++) {
            points += votes.get(i);
        }
        points += distance.get(round - 1);
    }

    int getPoints() { return points; }

    public StringBuilder distanceToString() {
        StringBuilder sb = new StringBuilder();
        sb.append("            jump lengths: ");
        for (Integer dist : distance) {
            sb.append(dist);
            sb.append(" m, ");
        }
        sb.setLength(sb.length() - 2);
        return sb;
    }

    @Override
    public int compareTo(Jump o) {
        return this.points - o.points;
    }

    @Override
    public String toString() {
        return "           " + name + " (" + points + " points)\n" + distanceToString().toString();
    }
}
