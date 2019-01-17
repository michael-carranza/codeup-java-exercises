package src.shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        System.out.println(Rectangle.getPerimeter(box1));
        System.out.println(Rectangle.getArea(box1));

        Square box2 = new Square(5);
        System.out.println(Square.getPerimeter(box2));
        System.out.println(Square.getArea(box2));
    }
}
