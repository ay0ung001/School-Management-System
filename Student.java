import java.util.*;
/**
 * this file keeps track of a student's name, their id, their major(s),
 * their fees, their gpa, and how many clubs they joined
 */

public class Student
{
  String name; 
  int id; 
  List<String> major; 
  boolean moreThanOneMajor;
  double tuition;
  double feesDue;
  double amtPaid;
  double gpa;
  int clubsJoined;

  Student(String name, int id, List<String> major, boolean moreThanOneMajor, double tuition, double feesDue, double amtPaid, double gpa, int clubsJoined)
  {
    this.name = name;
    this.id = id;
    this.major = major;
    this.moreThanOneMajor = false;
    this.tuition = 350000;
    this.feesDue = 0;
    this.amtPaid = 0;
    this.gpa = gpa;
    this.clubsJoined = 0;
  }

  /**
   * student's name
   * @return name of the student
   */
  public String getName()
  {
    return name;
  }

  /**
   * getter method for the student's id
   * @return id of the student
   */
  public int getId()
  {
    return id;
  }  

  /**
   * getter method for the student's major(s)
   * @return a list of the student's major(s)
   */
  public List<String> getMajor()
  {
    return major;
  }

  /**
   * determines if the student has more than one major
   * @return true if the student has more than one major, false otherwise
   */
  public boolean moreThanOneMajor()
  {
    if(major.size() > 1) return true;
    else return false;
  }

  /**
   * student pays fees, updates amtPaid and school's funds
   * @param fees - amt that the student pays
   */
  public void payFees(int fees)
  {
    amtPaid += fees;
    School.totalMoneyEarned(fees);
  }
  
  /**
   * determines how much the student has left in fees
   * @param amtPaid - amt that the student paid 
   * @return amt of fees left that the student must pay
   */
  public double feesDue(double amtPaid)
  {
    return tuition - amtPaid;
  }

  /**
   * getter method for the student's gpa
   * @return - student's gpa
   */
  public double getGpa()
  {
    return gpa;
  }

  /**
   * amt of clubs student joined
   * @return - number of clubs the student joined
   */
  public int getClubsJoined()
  {
    return clubsJoined;
  }
}