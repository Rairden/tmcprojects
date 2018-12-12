
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Top 10 players by points");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println();

        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println();

        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println();

        NHLStatistics.teamStatistics("PHI");
        System.out.println();

        // Print the players in Anaheim Ducks (abbreviation: ANA) ordered by points.
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");

    }
}
