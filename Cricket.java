import java.util.ArrayList;
import java.util.List;

public class Cricket{
    public static void main(String[] args) {
        // Define the list of team names
        List<String> teamNames = new ArrayList<>();
        teamNames.add("Team A");
        teamNames.add("Team B");
        teamNames.add("Team C");
        teamNames.add("Team D");
        teamNames.add("Team E");

        // Calculate the total number of matches required
        int totalMatches = (teamNames.size() - 1) * teamNames.size() / 2;

        // Create a list to store the match schedule
        List<String> matchSchedule = new ArrayList<>();

        // Loop through all possible match combinations
        for (int i = 0; i < teamNames.size(); i++) {
            for (int j = i + 1; j < teamNames.size(); j++) {
                // Create a match between team i and team j
                String match = teamNames.get(i) + " vs. " + teamNames.get(j);

                // Check if this match has already been scheduled
                if (!matchSchedule.contains(match)) {
                    // Add the match to the schedule
                    matchSchedule.add(match);
                }
            }
        }

        // Print the match schedule
        for (int i = 0; i < totalMatches; i++) {
            System.out.println("Match " + (i + 1) + ": " + matchSchedule.get(i));
        }
    }
}
