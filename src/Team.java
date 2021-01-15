/**
 * Models a specific football team with the specific statistic values related to said team. Special Circumstance: On
 * week 0, the previous rank will be the CFP initial rankings. That will be the starting point during each season.
 *
 * @author Brooskiey
 * @author Unwonted_Person
 * @version 0.1
 * @date 01/14/2021
 */

public class Team {

    /**
     * Name of the team
     */
    public String teamName;

    /**
     * Last weeks rank of the team
     */
    public int previousRank;

    /**
     * This weeks rank of the team
     */
    public int currentRank;

    /**
     * The interceptions thrown this week
     */
    public int interception;

    /**
     * The touchdowns for this team
     */
    public int touchdowns;

    /**
     * The rank of the team they played
     */
    public int opposingRank;

    /** The overall rank of the teams that are played */
    //public int scheduleStrength;

    /**
     * The passing yards for this week
     */
    public int passingYards;

    /**
     * The rushing yards for this week
     */
    public int rushingYards;

    /**
     * The total win record for this season
     */
    public int wins;

    /**
     * The total lose record for this season
     */
    public int losses;

    /**
     * The picks by the defense this week
     */
    public int picks;

    /**
     * Boolean value for if the team won
     */
    public boolean weeklyWin = false;

    /**
     * The equation score that will determine this weeks ranking
     */
    public double score;

    /**
     * Creates a football team object
     */
    public Team(String team, int previous, int current, int intercepts, int touchdown, int opposing,
                int passing, int rushing, int win, int lose, int pick) {
        teamName = team;
        previousRank = previous;
        currentRank = current;
        interception = intercepts;
        touchdowns = touchdown;
        opposingRank = opposing;
        passingYards = passing;
        rushingYards = rushing;
        wins = win;
        losses = lose;
        picks = pick;
    }

    /**
     * Set the previous rank
     */
    public void updatePrevious(int newPrevious) {
        previousRank = newPrevious;
    }

    /**
     * Set the Current rank
     */
    public void updateCurrent(int newCurrent) {
        currentRank = newCurrent;
    }

    /**
     * Move the current rank to the previous rank and set a new current rank
     */
    public void rotateRanks(int newCurrent) {
        previousRank = currentRank;
        currentRank = newCurrent;
    }

    /**
     * Set the interceptions for this team
     */
    public void updateIntercepts(int newIntercepts) {
        interception = newIntercepts;
    }

    /**
     * Set the touchdowns for this team
     */
    public void updateTouchdowns(int newTouchdown) {
        touchdowns = newTouchdown;
    }

    /**
     * Set the rank of the opposing team
     */
    public void updateOpposing(int newOpposing) {
        opposingRank = newOpposing;
    }

    /**
     * Sets the win for this week. lose = false. win = true
     */
    public void updateWin(boolean win) {
        weeklyWin = win;
    }

    /**
     * Set the score for this weeks statistics
     */
    public void updateScore(double calcScore) {
        score = calcScore;
    }

    /**
     * Creates a string representing all the statistics of this team
     *
     * @return A formatted string containing all the statistics for this team
     */
    public String print() {
        return teamName + "\t" + previousRank + "\t" + currentRank + "\t" + interception + "\t" + touchdowns + "\t" +
                opposingRank + "\t" + passingYards + "\t" + rushingYards + "\t" + wins + "\t" + losses + "\t" + picks +
                weeklyWin + "\n";
    }
}//end Team
