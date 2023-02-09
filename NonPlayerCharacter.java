import java.security.SecureRandom;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author Firstene Badua
 * @version 1.3
 * Lab1
 * CS131ON
 */

/**
 * Represents a Non-Player Character in the game.
 * 
 * @author [Your Name Here]
 */
public class NonPlayerCharacter extends GameCharacter {
    private boolean active;
    private String intelligenceType;
    private SecureRandom rand = new SecureRandom();
    
    /**
     * Default constructor that sets the values for active to false and 
     * intelligenceType to "AVERAGE".
     */
    public NonPlayerCharacter() {
        super();
        setActive(false);
        setIntelligenceType("AVERAGE");
    }
    
    /**
     * Constructor that sets the values for uniqueID, personality, active, and
     * intelligenceType to the specified values.
     * 
     * @param id The unique identifier for the character
     * @param personality The personality of the character
     * @param active Whether the character is active or not
     * @param intelligenceType The type of intelligence the character has
     */
    public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
        super(id, personality);
        setActive(active);
        setIntelligenceType(intelligenceType);
    }
    
    /**
     * Returns whether the character is active or not.
     * 
     * @return The active status of the character
     */
    public boolean isActive() {
        return active;
    }
    
    /**
     * Sets the active status of the character.
     * 
     * @param active The new active status of the character
     *     /**
     * Sets the active status of the character.
     * 
     * @param active The new active status of the character
     */
    public void setActive(boolean active) {
        this.active = active;
    }
    
    /**
     * Returns the type of intelligence the character has.
     * 
     * @return The type of intelligence the character has
     */
    public String getIntelligenceType() {
        return intelligenceType;
    }
    
    /**
     * Sets the type of intelligence the character has.
     * 
     * @param intelligenceType The new type of intelligence the character has
     */
    public void setIntelligenceType(String intelligenceType) {
        this.intelligenceType = intelligenceType;
    }
    
    /**
     * Returns a report structure detailing the character's information.
     * 
     * @return The report structure for the character
     */
    public String reportStructure() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.reportStructure());
        sb.append("\n==================================\n\n");
        sb.append("Active: " + isActive() + "\n");
        sb.append("Intelligence: " + getIntelligenceType() + "\n");
        sb.append("\n==================================");
        return sb.toString();
    }
    /**
     * Returns a message introducing the character.
     * 
     * @return The introduction message
     */
    public String introduce() {
        return "Hello, my name is " + getUniqueID();
    }
    
    /**
     * Returns an exclamation from the character.
     * 
     * @return The exclamation from the character
     */
    public String exclaim() {
        String[] exclamations = {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
        int index = rand.nextInt(exclamations.length);
        return exclamations[index];
    }
}


