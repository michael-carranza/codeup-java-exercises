package shapes;

public class Circle {
private static int numberOfCircles=0;

    public Circle (double radius) {
        this.radius = radius;
        numberOfCircles++;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    private double radius;
    // constructor

    public double getRadius(){
        return this.radius;
    }


    public double getCircumference(){
        double radius = this.radius;
        return (Math.PI * (radius * 2));
    }
//END OF EVERYTHING
    }
