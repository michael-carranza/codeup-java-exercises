package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the shapes application!");
//        System.out.println("The number of circles is: " + Circle.numberOfCircles());
        System.out.println("What is your circle's radius?");
        int radius = Input.getInt();
        Circle myCircle = new Circle(radius);
        double radius1 = myCircle.getRadius();

        System.out.println("Your circle has a radius of: ");
        System.out.println(radius1);

        System.out.println("Your circle has an area of: ");
        System.out.println(myCircle.getArea());

        System.out.println("Your circle has a circumference of: ");
        System.out.println(myCircle.getCircumference());

    }
    Scanner scan = new Scanner(System.in).useDelimiter("\n");

}
