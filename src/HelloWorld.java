import java.util.Scanner;
public class HelloWorld<myString> {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int myFavoriteNumber = 5;
        String myString = "3.14159";
        System.out.println(myString);
        float myNumber = 123L;
        System.out.println(myNumber);
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;

        double pi = 3.14159;
        System.out.format(".2f%n",pi);
        System.out.println("The value of pi is approximately " + pi + ".");

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
//
        System.out.print("Please enter an integer.");
        int userInput = scan.nextInt();
//
        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.println("Please enter 3 words.");
        String userInput1 = scan.next();
        String userInput2 = scan.next();
        String userInput3 = scan.next();
        System.out.println("You entered: \"" + userInput1 + "\", \"" + userInput2 +"\", " + "and \"" + userInput3 +"\".");


        System.out.println("Please enter a sentence.");
        String sentence = scan.next();
        System.out.println("You entered: \"" + sentence + "\".");

        System.out.println("Let's calculate the area of a rectangle!");
        System.out.println("What's the length?");
        int length = Integer.parseInt(scan.next());
        System.out.println("What's the width?");
        int width = Integer.parseInt(scan.next());
        int area = length * width;
        int perimeter = (2*length)+(2*width);
        System.out.println("The area is " + area + ".");
        System.out.println("The perimeter is " + perimeter + ".");


    }
}