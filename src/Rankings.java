/**
 * An abstract class for calculating the score, sorting the teams to the highest score to the lowest score, and swapping
 * the teams around.
 *
 * @author Brooskiey
 * @author Unwonted_Person
 * @version 0.1
 * @date 01/14/2021
 */

public abstract class Rankings {

    /**
     * Calculate the score based on the statistic weighs and team statistics
     */
    public void calculateScore(Team team) {
        double score = 0.0; //TODO: Come up with an equation
        team.updateScore(score);
    }

    /**
     * Sort the teams based on the score from highest score to lowest score.
     */
    public void sort(Team[] teams) {
        for (int i = 0; i < teams.length; i++) {
            for (int j = 0; j < teams.length; j++) {
                if (i != j && teams[i].score < teams[j].score) {
                    swap(teams, i, j);
                }//end if
            }//end inner for
        }//end outer for
    }

    /**
     * Swap the positions of two teams in the array
     */
    public void swap(Team[] teams, int one, int two) {
        Team temp = teams[one];
        teams[two] = teams[one];
        teams[two] = temp;
    }
}//end Rankings
