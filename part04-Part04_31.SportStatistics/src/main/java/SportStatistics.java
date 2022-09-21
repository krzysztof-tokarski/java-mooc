
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = scan.nextLine();

        System.out.println("Team: ");
        String team = scan.nextLine();

        try (Scanner reader = new Scanner(Paths.get(fileName))) {

            int games = 0;
            int wins = 0;
            int losses = 0;

            while (reader.hasNextLine()) {
                String inputRow = reader.nextLine();

                if (!(inputRow.contains(team))) {
                    continue;
                }

                games++;

                String[] splitted = inputRow.split(",");
                String homeTeam = splitted[0];
                int homeTeamScore = Integer.valueOf(splitted[2]);
                int awayTeamScore = Integer.valueOf(splitted[3]);

                boolean draw = homeTeamScore == awayTeamScore;
                boolean homeTeamWin = homeTeamScore > awayTeamScore;
                boolean teamIsHomeTeam = homeTeam.equals(team);

                if (draw) {
                    continue;
                }

                boolean homeTeamAndHomeWin = teamIsHomeTeam && homeTeamWin;
                boolean notHomeTeamAndHomeLoss = !teamIsHomeTeam && !homeTeamWin;

                if (homeTeamAndHomeWin || notHomeTeamAndHomeLoss) {
                    wins++;
                } else {
                    losses++;
                }

            }
        
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {

        }

    }

}
