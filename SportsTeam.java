/**
 * Represents a generic sports team.
 * @author Firstene Badua
 * @version 1.3
 * Lab1
 */
public abstract class SportsTeam {
    /**
     * The name of the team.
     */
    private String teamName;
    
    /**
     * The team mascot.
     */
    private String teamMascot;
    
    /**
     * The head coach.
     */
    private String headCoach;
    
    /**
     * The number of wins.
     */
    private int wins;
    
    /**
     * The number of losses.
     */
    private int losses;
    
    /**
     * Creates an instance of the SportsTeam class with empty instance fields.
     */
    public SportsTeam() {
        this.teamName = "";
        this.teamMascot = "";
        this.headCoach = "";
        this.wins = 0;
        this.losses = 0;
    }
    
    /**
     * Creates an instance of the SportsTeam class with specified instance fields.
     * 
     * @param teamName the name of the team
     * @param teamMascot the team mascot
     * @param headCoach the head coach
     * @param losses2 
     * @param wins2 
     */
    public SportsTeam(String teamName, String teamMascot, String headCoach, int wins2, int losses2) {
        this.teamName = teamName;
        this.teamMascot = teamMascot;
        this.headCoach = headCoach;
        this.wins = 0;
        this.losses = 0;
    }
    
    /**
     * Returns the win percentage of the team.
     * 
     * @return the win percentage of the team
     */
    public double getWinPercentage() {
        return (double) wins / (wins + losses);
    }
    
    /**
     * Returns an array of the team's stats.
     * 
     * @return an array of the team's stats
     */
    public abstract double[] getStats();
}
