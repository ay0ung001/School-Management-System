/**
 * Creates Student and Teacher Objects within a School and uses various methods as interaction
 * Creation: 9 Aug. 2022
 */
import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    // creating Teacher objects
    List <String> jorgeSalasSubjects = new ArrayList<String>();
    jorgeSalasSubjects.add("AP Calculus BC");
    jorgeSalasSubjects.add("AP Computer Science A");
    jorgeSalasSubjects.add("Algebra I");

    Teacher jorgeSalas = new Teacher("Jorge Salas", 397096, jorgeSalasSubjects, 75000, 26);

    List <String> margueritaDrewSubjects = new ArrayList<String>();
    margueritaDrewSubjects.add("AP English Literature");
    margueritaDrewSubjects.add("Journalism");
    margueritaDrewSubjects.add("English IV");

    Teacher margueritaDrew = new Teacher("Marguerita Drew", 211566, margueritaDrewSubjects, 73456, 20);

    List <String> marcosAndradeSubjects = new ArrayList<String>();
    marcosAndradeSubjects.add("AP Government");
    marcosAndradeSubjects.add("Economics");
    marcosAndradeSubjects.add("Psychology");
    marcosAndradeSubjects.add("World Geography");

    Teacher marcosAndrade = new Teacher("Marcos Andrade", 983940, marcosAndradeSubjects, 45230, 5);

    List <String> derekYuillSubjects = new ArrayList<String>();
    derekYuillSubjects.add("Speech and Debate");

    Teacher derekYuill = new Teacher("Derek Yuill", 728948, derekYuillSubjects, 90402, 33);
    
    List <String> scottBrummettSubjects = new ArrayList<String>();
    scottBrummettSubjects.add("Physical Education");
    scottBrummettSubjects.add("Cross Country");

    Teacher scottBrummett = new Teacher("Scott Brummett", 607493, scottBrummettSubjects, 93029, 45);
    
    // adding Teacher objects to Teacher list
    List <Teacher> teachersList = new ArrayList<>();
    teachersList.add(jorgeSalas);
    teachersList.add(margueritaDrew);
    teachersList.add(marcosAndrade);
    teachersList.add(derekYuill);
    teachersList.add(scottBrummett);

    // creating Student objects
    List<String> lilyMajors = new ArrayList<>();
    lilyMajors.add("Electrical Engineering");

    Student lily = new Student("Lily", 876469, lilyMajors, 22476, 3.33, 4);

    List<String> tamiMajors = new ArrayList<>();
    tamiMajors.add("Economics");
    tamiMajors.add("Communications");

    Student tami = new Student("Tami", 457801, tamiMajors, 37230, 3.6, 2);

    List<String> bruceMajors = new ArrayList<>();
    bruceMajors.add("English Composition");

    Student bruce = new Student("Bruce", 830132, bruceMajors, 30932, 4.0, 1);

    List<String> oscarMajors = new ArrayList<>();
    oscarMajors.add("Micro and Celluar Biology");
    oscarMajors.add("Public Health");

    Student oscar = new Student("Oscar", 217870, oscarMajors, 20983, 4.0, 5);

    List<String> stephenMajors = new ArrayList<>();
    stephenMajors.add("Computer Engineering");
    stephenMajors.add("Computer Science");

    Student stephen = new Student("Stephen", 964678, stephenMajors, 0, 3.89, 1);
  
    // adding Student objects to Student list
    List <Student> studentsList = new ArrayList<>();
    studentsList.add(lily);
    studentsList.add(tami);
    studentsList.add(bruce);
    studentsList.add(oscar);
    studentsList.add(stephen);

    // created School object
    School sghs = new School(teachersList,studentsList);

    // students pay fees
    lily.payFees(22476);
    tami.payFees(37230);
    oscar.payFees(20983);
    bruce.payFees(30932);

    // total money earned by school
    System.out.println("SGHS earned: $" + sghs.getTotalMoneyEarned()); // expect 111621.0

    // school pays two teachers
    jorgeSalas.receiveSalary(jorgeSalas.getSalary());
    System.out.println("SGHS has spent: $" + sghs.getTotalMoneySpent() + " and now has $" + sghs.getTotalMoneyLeft() + " left."); // expect 75000, 36621.0
    derekYuill.receiveSalary(derekYuill.getSalary());
    System.out.println("SGHS has spent: $" + sghs.getTotalMoneySpent() + " and now has $" + sghs.getTotalMoneyLeft() + " left."); // expect 165402.0, -53781.0
  
    // creation of new Teacher object
    List <String> geoffBarracloughSubjects = new ArrayList<String>();
    geoffBarracloughSubjects.add("AP Statistics");
    geoffBarracloughSubjects.add("AP Computer Science Principles");
    geoffBarracloughSubjects.add("Statistics");

    Teacher geoffBarraclough = new Teacher("Geoff Barraclough", 735341, geoffBarracloughSubjects, 87504, 32);
    
    // school adds new teacher 
    sghs.addTeacher(geoffBarraclough);

    // printing the teachers at the school: 
    System.out.println("The following teachers are now at this school: ");
    for(Teacher teacher : teachersList)
    {
      System.out.println(teacher.getName()); // expect Jorge Salas, Marguerita Drew, Marcos Andrade, Derek Yuill, Scott Brummett, Geoff Barraclough
    }

    // print attributes of student Stephen
    System.out.println("The student's name is: " + stephen.getName()); // expect Stephen
    System.out.println("The student's id is: " + stephen.getId()); // expect 964678
    System.out.println("The student's major(s) are: " + stephen.getMajor()); // expect Computer Engineering, Computer Science
    System.out.println("The student's tuition is: $" + stephen.getTuition()); // expect 0, 
    System.out.println("The student's gpa is: " + stephen.getGpa()); // expect 3.89
    System.out.println("The student has joined: " + stephen.getClubsJoined() + " club(s)"); // expect 1
    System.out.println("The student has multiple majors: " + stephen.moreThanOneMajor()); // expect true
  
    System.out.println();
    
    // print attributes of teacher Marcos Andrade
    System.out.println("The teacher's name is: " + marcosAndrade.getName()); // expect Marcos Andrade
    System.out.println("The teacher's id is: " + marcosAndrade.getId()); // expect 983940
    System.out.println("The teacher teaches: " + marcosAndrade.getSubjectsTaught()); // expect AP Government, Economics, Psychology, World Geography
    System.out.println("The teacher's salary is: $" + marcosAndrade.getSalary()); // expect 45230
    System.out.println("The teacher has worked: " + marcosAndrade.getYearsWorked() + " years"); // expect 5
  }
}
