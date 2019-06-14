import java.util.*;
import java.util.stream.Collectors;

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

                if (round == 1) {
                    printJumpOrder(1);
                    jump(1);
                    printRoundResults(1);
                } else {
                    printJumpOrder(round);
                    jump(round);
                    printRoundResults(round);
                }
            }
            round++;
        }
        printTournamentResults();
    }

    void jump(int round) {
        for (Jump jump : players.values()) {
            jump.addJump();
            jump.addVote(5);
            jump.calcPoints(round);
        }
    }

    private void printTournamentResults() {
        System.out.println("\nThanks!\n");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");

        List t = sortAndListValues(players);
        for (int i = 0; i < t.size(); i++) {
            System.out.print(i+1 + t.get(i).toString() + "\n");
        }
    }

    private void printJumpOrder(int round) {
        LinkedHashMap<String, Jump> result = players.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue,
                                (x, y) -> x,
                                LinkedHashMap::new
                        )
                );
        int index = 1;
        for (Map.Entry<String, Jump> entry : result.entrySet()) {
            System.out.printf("  %d. %s (%d points)\n", index, entry.getKey(), entry.getValue().getPoints());
            index++;
        }
        System.out.println();
    }

    private void printRoundResults(int round) {
        System.out.println("Results of round " + round);
        for (Map.Entry<String, Jump> entry : players.entrySet()) {
            System.out.printf("  %s\n" +
                    "    length: %d\n" +
                    "    judge votes: %s\n", entry.getKey(),
                    entry.getValue().distance.get(round - 1), entry.getValue().getTmpVotes().toString());
            entry.getValue().getTmpVotes().clear();
        }
        System.out.println();
    }

    private static <K, V extends Comparable<V>> List<V> sortAndListValues(Map<K,V> map) {
        List<V> toReturn = new LinkedList<>(map.values());
        Collections.sort(toReturn, new Comparator<V>() {
            public int compare(V first, V second) {
                return second.compareTo(first);
            }
        });
        return toReturn;
    }
}
