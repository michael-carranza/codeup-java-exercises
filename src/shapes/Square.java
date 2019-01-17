package src.shapes;

public class Square extends Rectangle{
    public Square(int side) {
        super(side, side);
    }

    public void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Your square has sides that measure: " + Rectangle.getWidth(square));
        System.out.println("The area of your square is: " + getArea());
        System.out.println("The perimeter of your rectangle is: " + getPerimeter());
    }

    public int getArea() {
        int side = getWidth(this);
        int area = (int)Math.pow(side, 2);
        return area;
    }
    public int getPerimeter() {
        int side = getWidth(this);
        return (4*side);
    }
}
