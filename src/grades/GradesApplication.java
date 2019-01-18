package src.grades;
import util.Input;

import java.util.HashMap;
import java.util.Set;

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
        austin.addGrade(72);
        austin.addGrade(80);
        austin.addGrade(82);
        yourMom.addGrade(66);
        yourMom.addGrade(68);
        yourMom.addGrade(67);

        HashMap<String, Student> students = new HashMap<>();
        students.put("SensitiveGuy182", mike);
        students.put("ReUpYouCrazy", austin);
        students.put("NotTheAssistantManager", chris);
        students.put("MissFrizzle", yourMom);

        boolean keepGoing=false;
    do {
        System.out.println("Welcome!\n");
        System.out.println("Here are some of the github usernames of our students:\n");
        System.out.println(students.keySet());

        String search = Input.getString("\nWhat student would you like more information on?\n");
        if (students.containsKey(search)) {
            Student result = students.get(search);
            String resultName = result.name;
//            String userName = getKey(students, result);
            System.out.println("GitHub Username: " + search);
            System.out.println("Student name: " + result.name);
            System.out.println("Grade Average: " + result.getGradeAverage());
            keepGoing = Input.yesNo("\nWould you like to search for another student?");

        } else {
            System.out.println("Sorry. We don't have a student named " + search + ".\n");
            keepGoing = Input.yesNo("\nWould you like to search for another student?");
        }
    }while(keepGoing);
    }
//    public static <K, V> K getKey(HashMap<K, V> students, Student result) {
//        for (K key : students.keySet()) {
//            if (result.equals(students.get( key))) {
//                return key;
//            }
//        }
//        return null;
//    }

}
