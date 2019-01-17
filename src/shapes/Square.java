package src.shapes;

public class Square extends Quadrilateral{

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(length,2);
    }
}
