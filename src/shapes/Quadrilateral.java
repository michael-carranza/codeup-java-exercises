package src.shapes;

 abstract public class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    // CONSTRUCTOR
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }
// GETTERS
    public double getLength() { return length; }
    public double getWidth() { return width; }
// SETTERS
     abstract public void setLength(double length);
     abstract public void setWidth(double width);
}

// 9. Without getPerimeter, Rectangle fails to meet the criteria established by the quadrilateral interface. This functions as a checklist of expected methods, which must ALL be present before the compiler accepts the Rectangle class.

//10. myShape implements the Measurable interface, which does not have a getLength method. This means that in order to call the getLength method, it would either need to be added to the Measurable interface (then every other class that implements said interface) or on the Rectangle class which defines myShape.