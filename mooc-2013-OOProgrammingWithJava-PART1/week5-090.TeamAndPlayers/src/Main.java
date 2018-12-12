import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Team barcelona = new Team("FC Barcelona");

        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);

        barcelona.setMaxSize(1);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);

        // works similarly as the above
        barcelona.addPlayer(new Player("Mikael", 1));

        System.out.println("Total goals: " + barcelona.goals());
        barcelona.printPlayers();

    }
}

