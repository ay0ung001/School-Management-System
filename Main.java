import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
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
    
    List <Teacher> teachers = new ArrayList<>();
    teachers.add(jorgeSalas);
    teachers.add(margueritaDrew);
    teachers.add(geoffBarraclough);
    teachers.add(marcosAndrade);
    teachers.add(derekYuill);
    teachers.add(scottBrummett);
  }
}
