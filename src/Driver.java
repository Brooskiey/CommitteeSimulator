import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Driver for running the program. This will take input from the file and create the teams that will be scored.
 *
 * @author Brooskiey
 * @author Unwonted_Person
 * @version 0.1
 * @date 01/14/2021
 */
public class Driver {

    /**
     * Array containing all the teams being scored
     */
    public Team[] teams = new Team[30];

    /**
     * The CSV file containing the data needed
     */
    public File CSVFile;

    /**
     * Main method to run the program
     */
    public static void main(String[] args) {
        //TODO: create final driver class
    }

    /**
     * Creates the file based on the file name
     *
     * @param fileName The name of the file
     *
     * @return True if the fileName was not null and false otherwise
     */
    public boolean createFile(String fileName) {
        if (fileName != null) {
            CSVFile = new File(fileName);
            return true;
        }
        return false;
    }

    /**
     * Populate the Teams array with the teams from the CSV file
     */
    public void popTeams() {
        try {
            Scanner scan = new Scanner(CSVFile);
            String[] line = scan.nextLine().split(",");
            for (int i = 0; i < teams.length; i++) {
                teams[i] = new Team(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]),
                        Integer.parseInt(line[3]), Integer.parseInt(line[4]), Integer.parseInt(line[5]),
                        Integer.parseInt(line[6]), Integer.parseInt(line[7]), Integer.parseInt(line[8]),
                        Integer.parseInt(line[9]), Integer.parseInt(line[10]));
                line = scan.nextLine().split(",");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }//end try catch block
    }

    /**
     * Print the teams and statistics to the console
     *
     * @param teams An array holding the teams being scored
     */
    public void printRanks(Team[] teams) {
        System.out.println("Team Name\tPrevious Rank\tCurrent Rank\tInterceptions\tTouchdowns\tOpposing Rank\tPassing Yards"
                + "\tRushing Yards\tWins\tLosses\tPicks\tWeekly Win");
        for (int i = 0; i < teams.length; i++) {
            System.out.println(teams[i].print());
        }
    }
}
