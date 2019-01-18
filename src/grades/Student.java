package src.grades;

import java.util.ArrayList;

public class Student {
    protected String name;
    private ArrayList<Integer> grades;

    public static void main(String[] args) {
        Student mike = new Student("Michael");
        Student chris = new Student("Krayuhs");
        Student austin = new Student("Austin");

        mike.grades.add(93);
        mike.grades.add(95);
        chris.grades.add(97);
        chris.grades.add(99);
        austin.grades.add(92);
        austin.grades.add(94);

        System.out.println(mike.name + "'s average is: " + mike.getGradeAverage());
        System.out.println(chris.name + "'s average is: " + chris.getGradeAverage());
        System.out.println(austin.name + "'s average is: " + austin.getGradeAverage());

    }

    // CONSTRUCTOR
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>(); ;
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for (int i = 0;i < grades.size();i++){
            total += grades.get(i);
        } return total / grades.size();
    }
    // END OF EVERYTHING
}

