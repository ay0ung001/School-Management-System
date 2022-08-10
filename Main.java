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

    List <String> geoffBarracloughSubjects = new ArrayList<String>();
    geoffBarracloughSubjects.add("AP Statistics");
    geoffBarracloughSubjects.add("AP Computer Science Principles");
    geoffBarracloughSubjects.add("Statistics");

    Teacher geoffBarraclough = new Teacher("Geoff Barraclough", 735341, geoffBarracloughSubjects, 87504, 32);

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
    List <Teacher> teachers = new ArrayList<>();
    teachers.add(jorgeSalas);
    teachers.add(margueritaDrew);
    teachers.add(geoffBarraclough);
    teachers.add(marcosAndrade);
    teachers.add(derekYuill);
    teachers.add(scottBrummett);

    // creating Student objects
    List<String> lilyMajors = new ArrayList<>();
    lilyMajors.add("Electrical Engineering");

    Student lily = new Student("Lily", 876469, lilyMajors, 35476, 3.33, 4);

    List<String> tamiMajors = new ArrayList<>();
    tamiMajors.add("Economics");
    tamiMajors.add("Communications");

    Student tami = new Student("Tami", 457801, tamiMajors, 37230, 3.6, 2);

    List<String> patriciaMajors = new ArrayList<>();
    patriciaMajors.add("Environmental Science");
    patriciaMajors.add("Molecular Environmental Biology");

    Student patricia = new Student("Patricia", 19691, patriciaMajors, 25602, 3.32, 2);

    List<String> tracyMajors = new ArrayList<>();
    tracyMajors.add("Computer Engineering");

    Student tracy = new Student("Tracy", 374347, tracyMajors, 25032, 0.0, 0);

    List<String> bruceMajors = new ArrayList<>();
    bruceMajors.add("English Composition");

    Student bruce = new Student("Bruce", 830132, bruceMajors, 35932, 4.0, 1);

    List<String> oscarMajors = new ArrayList<>();
    oscarMajors.add("Micro and Celluar Biology");
    oscarMajors.add("Public Health");

    Student oscar = new Student("Oscar", 217870, oscarMajors, 52302, 4.0, 5);

    List<String> josephMajors = new ArrayList<>();
    josephMajors.add("Statistics");
    josephMajors.add("Data Science");

    Student joseph = new Student("Joseph", 632965, josephMajors, 52302, 4.0, 5);

    List<String> stephenMajors = new ArrayList<>();
    stephenMajors.add("Computer Engineering");

    Student stephen = new Student("Stephen", 964678, stephenMajors, 52302, 3.89, 1);
  
    // adding Student objects to Student list
    List <Student> students = new ArrayList<>();
    students.add(lily);
    students.add(tami);
    students.add(patricia);
    students.add(tracy);
    students.add(bruce);
    students.add(oscar);
    students.add(joseph);
    students.add(stephen);
  }


}
