package src.shapes;
import src.shapes.Drawable;
import src.shapes.Printable;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    public void print() {
    }
    @Override
    public void setLength(double length) {
        this.length=length;
    }

    @Override
    public void setWidth(double width) {
        this.width=width;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public double getArea() {
        return width * length;
    }
//END OF EVERYTHING
}