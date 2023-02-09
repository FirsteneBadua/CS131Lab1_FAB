/**
 * This class represents a basketball team, storing information about the team name, team mascot, head coach, wins, losses, field goals, 
 * field goals attempted, free throws, free throws attempted. It also provides methods to calculate field goal percentage, free throw 
 * percentage, win percentage, and retrieve all stats in an array.
 */
public class BasketballTeam {
    private String teamName;
    private String teamMascot;
    private String headCoach;
    private int wins;
    private int losses;
    private int fieldGoals;
    private int fieldGoalsAttempted;
    private int freeThrows;
    private int freeThrowsAttempted;

    /**
     * Constructs a BasketballTeam object with the given team name, team mascot and head coach.
     * 
     * @param teamName the name of the team
     * @param teamMascot the mascot of the team
     * @param headCoach the head coach of the team
     */
    public BasketballTeam(String teamName, String teamMascot, String headCoach) {
        this.teamName = teamName;
        this.teamMascot = teamMascot;
        this.headCoach = headCoach;
    }

    /**
     * Returns the name of the team.
     * 
     * @return the name of the team
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Returns the mascot of the team.
     * 
     * @return the mascot of the team
     */
    public String getTeamMascot() {
        return teamMascot;
    }

    /**
     * Returns the head coach of the team.
     * 
     * @return the head coach of the team
     */
    public String getHeadCoach() {
        return headCoach;
    }

    /**
     * Returns the number of wins of the team.
     * 
     * @return the number of wins of the team
     */
    public int getWins() {
        return wins;
    }

    /**
     * Sets the number of wins of the team.
     * 
     * @param wins the number of wins to set
     */
    public void setWins(int wins) {
        this.wins = wins;
    }

    /**
     * Returns the number of losses of the team.
     * 
     * @return the number of losses of the team
     */
    public int getLosses() {
        return losses;
    }

    /**
     * Sets the number of losses of the team.
     * 
     * @param losses the number of losses to set
     */
    public void setLosses(int losses) {
        this.losses = losses;
    }

    /**
     * Returns the number of field goals of the team.
     * 
     * @return the number of field goals of the team
     */
    public int getFieldGoals() {
        return fieldGoals;
    }

    /**
     * Sets the number of field goals of the team.
     * 
     * @param fieldGoals the number of field goals to
    /**
     * Returns the number of field goals attempted by the team.
     * 
     * @return the number of field goals attempted by the team.
     */
    public int getFieldGoalsAttempted() {
        return fieldGoalsAttempted;
    }

    /**
     * Sets the number of field goals attempted by the team.
     * 
     * @param fieldGoalsAttempted the number of field goals attempted by the team.
     */
    public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
        this.fieldGoalsAttempted = fieldGoalsAttempted;
    }

    /**
     * Returns the number of free throws made by the team.
     * 
     * @return the number of free throws made by the team.
     */
    public int getFreeThrows() {
        return freeThrows;
    }
    /**
     * Sets the number of field goals of the team.
     * 
     * @param fieldGoals the number of field goals to set for the team.
     */
    public void setFieldGoals(int fieldGoals) {
        this.fieldGoals = fieldGoals;
    }
    /**
     * Sets the number of free throws made by the team.
     * 
     * @param freeThrows the number of free throws made by the team.
     */
    public void setFreeThrows(int freeThrows) {
        this.freeThrows = freeThrows;
    }

    /**
     * Returns the number of free throws attempted by the team.
     * 
     * @return the number of free throws attempted by the team.
     */
    public int getFreeThrowsAttempted() {
        return freeThrowsAttempted;
    }

    /**
     * Sets the number of free throws attempted by the team.
     * 
     * @param freeThrowsAttempted the number of free throws attempted by the team.
     */
    public void setFreeThrowsAttempted(int freeThrowsAttempted) {
        this.freeThrowsAttempted = freeThrowsAttempted;
    }

    /**
     * Returns the field goal percentage of the team, which is the ratio of field goals made to field goals attempted.
     * 
     * @return the field goal percentage of the team.
     */
    public double fieldGoalPercentage() {
        return ((double)fieldGoals / (double)fieldGoalsAttempted) * 100;
    }

    /**
     * Returns the free throw percentage of the team, which is the ratio of free throws made to free throws attempted.
     * 
     * @return the free throw percentage of the team.
     */
    public double freeThrowPercentage() {
        return ((double)freeThrows / (double)freeThrowsAttempted) * 100;
    }

    /**
     * Returns the win percentage of the team, which is the ratio of wins to total games played (wins + losses).
     * 
     * @return the win percentage of the team.
     */
    public double getWinPercentage() {
        return ((double)wins / (double)(wins + losses)) * 100;
    }

    /**

    Sets the stats for the team.
    @param wins the number of wins for the team.
    @param losses the number of losses for the team.
    @param fieldGoals the number of field goals for the team.
    @param fieldGoalsAttempted the number of field goal attempts for the team.
    @param freeThrows the number of free throws for the team.
    @param freeThrowsAttempted the number of free throw attempts for the team.
    */
    public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
    setWins(wins);
    setLosses(losses);
    setFieldGoals(fieldGoals);
    setFieldGoalsAttempted(fieldGoalsAttempted);
    setFreeThrows(freeThrows);
    setFreeThrowsAttempted(freeThrowsAttempted);
    }
    /**

    Returns the stats for the team as an array in the following order:
    number of wins, number of losses, field goal percentage, free throw percentage, and win percentage.
    @return an array containing the stats for the team.
    */
    public double[] getStats() {
    double[] stats = {wins, losses, fieldGoalPercentage(), freeThrowPercentage(), getWinPercentage()};
    return stats;
    }
}