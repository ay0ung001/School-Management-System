import java.util.*;

class School
{
  List<Teacher> teachers;
  List<Student> students;
  static double totalMoneyEarned;
  static double totalMoneySpent;

  public School(List<Teacher> teachers, List<Student> students, double totalMoneyEarned, double totalMoneySpent)
  {
    this.teachers = teachers; 
    this.students = students; 
    School.totalMoneyEarned = 0;
    School.totalMoneySpent = 0;
  }

  /**
   * list of teachers in the school
   * @return a list of teachers at the school
   */
  public List<Teacher> getTeachers()
  {
    return teachers; 
  }

  /**
   * list of students at the school
   * @return a list of students at the school
   */
  public List<Student> getStudents()
  {
    return students;
  }

  /**
   * adds a teacher to the school
   * @param teacher - teacher to be added
   */
  public void addTeacher(Teacher teacher)
  {
    teachers.add(teacher);
  }

  /**
   * adds a student to the school
   * @param student - student to be added
   */
  public void addStudent(Student student)
  {
    students.add(student);
  }

  /**
   * total money that the school earned
   * @return double value of the money earned by the school
   */
  public double getTotalMoneyEarned()
  {
    return totalMoneyEarned;
  }

  /**
   * total money that the school spent
   * @return double value of the money spent by the school
   */
  public double getTotalMoneySpent()
  {
    return totalMoneySpent;
  }

  /**
   * total money that the school earned
   * @param moneyEarned - to be added to totalMoneyEarned
   */
  public static void totalMoneyEarned(double moneyEarned)
  {
    totalMoneyEarned += moneyEarned; 
  }

  /**
   * total money that the school spent
   * @param moneySpent - to be subtracted from totalMoneyEarned
   */
  public static void totalMoneySpent(double moneySpent)
  {
    totalMoneyEarned -= moneySpent;
  }
}