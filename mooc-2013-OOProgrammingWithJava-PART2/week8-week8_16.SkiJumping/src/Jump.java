import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Jump implements Comparable<Jump> {

    public  ArrayList<Integer> distance;
    public  ArrayList<Integer> tmpVotes;
    private ArrayList<Integer> votes;
    private String name;
    private int points;

    public Jump(String name) {
        distance  = new ArrayList<>();
        tmpVotes  = new ArrayList<>();
        votes     = new ArrayList<>();
        points    = 0;
        this.name = name;
    }

    void addJump() {
        Random dist = new Random();
        int randDistance = dist.nextInt(61) + 60;
        distance.add(randDistance);
    }

    void addVote(int numVotes) {
        for (int i = 0; i < numVotes; i++) {
            Random vote = new Random();
            int randVote = vote.nextInt(11) + 10;
            tmpVotes.add(randVote);
        }
    }

    void appendVotes() {
        Collections.sort(tmpVotes);
        votes.addAll(tmpVotes);
    }

    void calcPoints(int round) {
        for (int i = 5 * round - 4, k = i; i < k + 3; i++) {
            points += votes.get(i);
        }
        points += distance.get(round - 1);
    }

    public String printJumpOrder() {
        return " " + name + " (" + points + " points)\n";
    }

    String printVotes(int round) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 5 * round - 5, k = i; i < k + 5; i++) {
            sb.append(votes.get(i)).append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }

    StringBuilder distanceToString() {
        StringBuilder sb = new StringBuilder();
        sb.append("            jump lengths: ");
        for (Integer dist : distance) {
            sb.append(dist).append(" m, ");
        }
        sb.setLength(sb.length() - 2);
        return sb;
    }

    @Override
    public String toString() {
        return "           " + name + " (" + points + " points)\n" + distanceToString().toString();
    }

    @Override
    public int compareTo(Jump o) {
        return this.points - o.points;
    }
}
