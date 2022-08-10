import java.util.*;
/**
 * this file keeps track of a teacher's name, their id, the subject(s) they teach,
 * their salary, and how long they have been working for
 */

public class Teacher
{
  String name;
  int id; 
  List<String> subjects; 
  double salary; 
  double salaryEarned;
  int yearsWorked;

  Teacher(String name, int id, List<String> subjects, double salary, int yearsWorked)
  {
    this.name = name;
    this.id = id;
    this.subjects = subjects; 
    this.salary = salary; 
    this.salaryEarned = 0;
    this.yearsWorked = yearsWorked;
  }

  /**
   * getter method for the teacher's name
   * @return teacher's name
   */
  public String getName()
  {
    return name; 
  }

  /**
   * getter method for teacher's id
   * @return teacher's id 
   */
  public int getId()
  {
    return id;
  }

  /**
   * getter method for the subject(s) taught by the teacher
   * @return list of subject(s) taught by the teacher
   */
  public List<String> getSubjectsTaught()
  {
    return subjects; 
  }

  /**
   * getter method for the teacher's salary
   * @return teacher's salary
   */
  public double getSalary()
  {
    return salary; 
  }

  /**
   * teacher receives salary, updates student's funds
   * @param salary - teacher's salary
   */
  public void receiveSalary(int salary)
  {
    salaryEarned += salary; 
    School.totalMoneySpent(salary);
  }
  /**
   * getter method for the number of years the teacher worked 
   * @return years the teacher worked 
   */
  public int getYearsWorked()
  {
    return yearsWorked;
  }
}