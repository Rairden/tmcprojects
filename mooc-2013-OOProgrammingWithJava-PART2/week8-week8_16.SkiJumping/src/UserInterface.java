import java.util.*;

public class UserInterface {

    private Scanner scan;
    private Map<String, Jump> players;

    public UserInterface(Scanner scan) {
        this.scan = scan;
        players = new HashMap<>();
    }

    void start() {
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; " +
                "an empty string brings you to the jumping phase.");

        while (true) {
            System.out.print("  Participant name: ");
            String name = scan.nextLine();
            if (name.equals("")) { break; }
            players.putIfAbsent(name, new Jump(name));
        }
        System.out.println("\nThe tournament begins!\n");

        int round = 1;
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command = scan.nextLine();

            if (command.equals("quit")) { break; }

            if (command.equals("jump")) {
                System.out.println("\nRound " + round + "\n");
                System.out.println("Jumping order:");

                printJumpOrder();
                jump(round);
                printRoundResults(round);
            }
            round++;
        }
        printTournamentResults();
    }

    void jump(int round) {
        for (Jump jump : players.values()) {
            jump.addJump();
            jump.addVote(5);
            jump.appendVotes();
            jump.calcPoints(round);
            jump.tmpVotes.clear();
        }
    }

    private void printJumpOrder() {
        List<Jump> list = sortAndListValues(players, false);

        for (int i = 0; i < list.size(); i++) {
            System.out.print("  " + (i + 1) + "." + list.get(i).printJumpOrder());
        }
        System.out.println();
    }

    private void printRoundResults(int round) {
        System.out.println("Results of round " + round);
        for (Map.Entry<String, Jump> entry : players.entrySet()) {
            System.out.printf("  %s\n    length: %d\n    judge votes: %s\n",
                    entry.getKey(),
                    entry.getValue().distance.get(round - 1),
                    entry.getValue().printVotes(round));
        }
        System.out.println();
    }

    private void printTournamentResults() {
        System.out.println("\nThanks!\n");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");

        List<Jump> list = sortAndListValues(players, true);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+1 + list.get(i).toString());
        }
    }

    private static <K, V extends Comparable<V>> List<V> sortAndListValues(Map<K,V> map, final boolean reverse) {
        List<V> toReturn = new LinkedList<V>(map.values());
        Collections.sort(toReturn, new Comparator<V>() {
            public int compare(V first, V second) {
                return reverse ? second.compareTo(first) : first.compareTo(second);
            }
        });
        return toReturn;
    }
}
