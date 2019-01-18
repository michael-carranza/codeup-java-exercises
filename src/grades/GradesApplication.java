package src.grades;
import java.util.HashMap;

        //Inside the main method, create a HashMap named students. It should have keys that are strings that represent github usernames, and values that are Student objects. Create at least 4 student objects with at least 3 grades each, and add them to the map.

public class GradesApplication {
    public static void main(String[] args) {
        Student austin = new Student("Austin");
        Student mike = new Student("Michael");
        Student chris = new Student("Krayuhs");
        Student yourMom = new Student("Your Mom");
        mike.addGrade(90);
        mike.addGrade(92);
        mike.addGrade(94);
        chris.addGrade(96);
        chris.addGrade(98);
        chris.addGrade(97);
        austin.addGrade(82);
        austin.addGrade(84);
        austin.addGrade(86);
        yourMom.addGrade(66);
        yourMom.addGrade(68);
        yourMom.addGrade(67);

        HashMap<String, Student> students = new HashMap<>();
        students.put("SensitiveGuy182", mike);
        students.put("ReUpYouCrazy", austin);
        students.put("NotTheAssistantManager", chris);
        students.put("MissFrizzle", yourMom);

    }
}
