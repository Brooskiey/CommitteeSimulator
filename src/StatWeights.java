/**
 * Enum file containing the weighting for each statistic that will be used in the equation.
 *
 * @author Brooskiey
 * @author Unwonted_Person
 * @version 0.1
 * @date 01/14/2021
 */

public enum StatWeights {

    //TODO: Set up the weights for each statistic type.
    PREVIOUS_RANK("Previous Rank", 0.00),
    CURRENT_RANK("Current Rank", 0.00),
    PASSING_PERCENTAGE("Passing Percentage", 0.00),
    INTERCEPTIONS("Interceptions", 0.0),
    TOUCHDOWNS("Touchdowns", 0.0),
    OPPOSING_RANK("Rank of Opposing Team", 0.0),
    PASSING_YARDS("Total Passing Yards", 0.0),
    RUSHING_YARDS("Rushing Yards", 0.0),
    WINS("Wins", 0.0),
    LOSSES("Losses", 0.0),
    PICKS("Picks", 0.0);
    //WEEKLYWIN("Weekly Win", 0.0);

    /**
     * Name of the statistic
     */
    private final String stats;
    /**
     * The weight for the equation
     */
    private final double weight;

    /**
     * Create a new StatWeight
     */
    StatWeights(String statName, double weightValue) {
        this.stats = statName;
        this.weight = weightValue;
    }

    /**
     * Get the statistic name
     *
     * @return the statistic name
     */
    public String getStats() {
        return this.stats;
    }

    /**
     * Get the weight of the statistic
     *
     * @return the statistic weight
     */
    public double getWeight() {
        return this.weight;
    }
}//end StatWeights
