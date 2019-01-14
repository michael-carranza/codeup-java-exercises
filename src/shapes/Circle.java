package shapes;

import util.Input;

public class Circle {

    public static void main(String[] args) {
        System.out.println("What is your circle's radius?");
        int radius = Input.getInt();
        Circle myCircle = new Circle(radius);

        System.out.println("Your circle has a radius of: ");
        System.out.println(radius);

        System.out.println("Your circle has an area of: ");
        System.out.println(myCircle.getArea());

        System.out.println("Your circle has a circumference of: ");
        System.out.println(myCircle.getCircumference());
    }

    private double getArea() {
        double radius = this.radius;
        double area = Math.PI * (radius * radius);
        return area;
    }


    private double radius;
    // constructor

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference(){
        double radius = this.radius;
        double circumference = Math.PI * (radius * 2);
        return circumference;
    }
//END OF EVERYTHING
    }
