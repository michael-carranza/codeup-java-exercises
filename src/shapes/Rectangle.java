package src.shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle (int length, int width) {
        this.length = length;
        this.width = width;
    }

    public static int getWidth(Rectangle rectangle) {
       return rectangle.length;
    }

    public void main(String[] args) {
       Rectangle rectangle = new Rectangle(2,4);
        System.out.println("Your rectangle has a length of " + rectangle.length +" and a width of " + rectangle.width);
        System.out.println("The area of your rectangle is: " + getArea(rectangle));
        System.out.println("The perimeter of your rectangle is: " + getPerimeter(rectangle));

    }

    public static int getArea(Rectangle rectangle) { return (rectangle.length * rectangle.width); }

    public static int getPerimeter(Rectangle rectangle) { return ((2 * rectangle.length) + (2 * rectangle.width)); }


//END OF EVERYTHING
}