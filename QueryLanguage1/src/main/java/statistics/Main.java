package statistics;

import statistics.matcher.*;

public class Main {

    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstats-2013-14.herokuapp.com/players.txt"));
        
        Matcher m1 = new QueryBuilder().playsIn("PHI")
                .hasAtLeast(10, "goals")
                .hasFewerThan(15, "assists").build();

        Matcher m2 = new QueryBuilder().playsIn("EDM")
                .hasAtLeast(50, "points").build();

        Matcher m = new QueryBuilder().oneOf(m1, m2).build();
        
        for (Player player : stats.matches(m)) {
            System.out.println(player);
        }
    }
}
