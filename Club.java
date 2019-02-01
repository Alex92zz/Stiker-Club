/**
 * Club represents a club such as Arsenal.
 * To keep things simple we just have a name and total goals by the club.
 * When we say total goals scored by the club we also mean total goals scored 
 * by all the strikers for the club. 
 * In the context of the Striker example, this is a component class.
 * @author Alexandru Daniel Zelea
 * @assignment TMA02 Q2
 * @date 07/01/2019
 *
 */
public class Club
{
   //instance variables
   private String name; // a club has a name, e.g. "Arsenal"
   private int totalGoals; // a club has total goals scored, e.g. 50
   
   /**
   * A constructor for objects of class Club if we know the name
   * but not the total goals scored by the club. Total goals will be set to 0.
   */
   public Club(String aName, int aGoals)
   {
      this.name = aName;
      this.totalGoals = aGoals;
   }
   
   /**
   * Setter for an club's name.
   */
   public void setName(String aName)
   {
      this.name = aName;
   }
   
   /**
   * Setter for club's total goals. The total number of goals must be a positive
   * integer. This method is used when a new Club is added to the system and the club 
   * already has scored a few goals.
   */
   public void setGoals(int aGoals)
   {
      if ( aGoals > 0)
      {
      this.totalGoals = totalGoals + aGoals;
      }
   }
   
   /**
   * Getter for the club's name.
   */
   public String getName()
   {
      return this.name;
   }
   
   /**
   * Getter for the club's total goals.
   */
   public int getGoals()
   {
      return this.totalGoals;
   }
   
   /**
   * Returns a description of this object as a string.
   */
   public String toString()
   {
      return "Name: " + this.getName() + "\r\n" +  
      "Total goals scored:" + this.getGoals();
   }
   
}
