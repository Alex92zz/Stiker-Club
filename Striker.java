/**
 * Objects of the Striker class model real-world Strikers who are playing for clubs
 * and have attributes representing the name of the striker, the date of birth of the 
 * striker, goals scored by the striker, and the club he plays for.
 * 
 * Striker is an example of a composite class 
 * 
 * An object of the Striker class has-an object of the Club class, which represets 
 * the club who signed the striker which means the striker is scoring goals for the club.
 * 
 * @author Alexandru Daniel Zelea 
 * @assignment TMA02 Q2
 * @date 07/01/2019
*/
public class Striker
{
   // instance variables 
   private String name; // a striker has-a name, e.g. "James" 
   private String dateOfBirth; // a striker has a date of birth, e.g. "29/01/1990"
   private int goalsScored; // goals scored by the striker e.g. 10
   private Club club; // the striker has-an club he plays for of type Club 
 
   /**
   * Constructor for objects of class Striker
   * allowing specification name, dateOfBirth, goals and club. 
   * The goalsScored is set to 0.
   */
   public Striker(String aName, String aDate, int aGoals, Club aClub)
   {
      this.name = aName;
      this.dateOfBirth = aDate;
      this.goalsScored = aGoals;
      this.club = aClub;
   }
   
   //Setter methods are provided for all the instance variable
   //so that these data can be altered in future if necessary,
   //e.g. if the attribution of the club changes.

   /**
   * Setter for a striker's club's name.
   * The name is an attribute of the component Club object,
   * not the Striker per se. So we have to forward the message
   * to the component object.
   */
   public void setStrikerClub(String aName)
   {
      this.club.setName(aName);
   }
   
   /**
   * Setter for a striker's date of birth.
   */
   public void setDateOfBirth(String aDate)
   {
      this.dateOfBirth = aDate;
   }
   
   /**
   * Setter method if a striker scored a new goal in a game. Cannot be a negative value.
   * The method will also increase the total goals from the club he is playing for.
   */
   public void setGoalsScored (int aGoals)
   {
      if (aGoals > 0)
      {
         this.goalsScored = goalsScored + aGoals;
         this.club.setGoals(aGoals);
      }
   }
   
   /**
   * Getter for the ration between the goals scored by the club and the 
   * goals scored by the Striker.
   */
   public float getGoalsRatio()
   {
      return (this.getGoalsScored()*100)/this.club.getGoals();
   }
   
   /**
   * Boolean value which returns true if the Striker scored less than 30% of the
   * total goals scored by the club.
   */
   public boolean isForSale()
   {
      return (this.getGoalsRatio() < 30);
   }
   
   /**
   * Getter for a striker's name.
   */
   public String getName()
   {
      return this.name;
   }
   
   /**
   * Getter for a striker's total goals scored.
   */
  public int getGoalsScored()
  {
     return this.goalsScored;
  }
   
   /**
   * Getter for a striker's date of birth.
   */
   public String getDateOfBirth()
   {
      return this.dateOfBirth;
   }
   
   /**
   * Getter for a striker's club's name.
   * This method returns "Unattributed" if the club's name
   * is not known (i.e. it has not been set) and otherwise
   * returns the club's name.
   */
   public String getClubsName()
   {
      //The club's name is part of the component Club object.
      //We also check if the component object exists
      if(this.club == null || this.club.getName() == null)
      {
         //no club or no club's name was set up
         return " Unattributed";
      }
      
      //the club component has been set up, 
      //so we can forward this message to the component object
      return this.club.getName();
   }
   
   /**
   * Returns a string describing this object.
   */
   public String toString()
   {
      return "Name: " + this.getName() + "\r\n" + 
      "Date of Birth: " + this.getDateOfBirth() + "\r\n" + 
      "Goals Scored: " + this.getGoalsScored() + "\r\n" +
      "Goals Ratio: " + this.getGoalsRatio() + "\r\n" + 
      "For sale: "+ this.isForSale() + "\r\n" + 
      "Plays for the Club: " + this.getClubsName() ;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
