package util;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
    getString();
    yesNo();
    getInt(1,50);
    getInt();
    getDouble(1,50);
    getDouble();
    }
    public static String getString(){
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter a message.");
        String userInput = scan.next();
        System.out.println(userInput);
        return userInput;
    }
    public static boolean yesNo(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Yes or no?");
        String check = scan.next();
        System.out.println((check.equalsIgnoreCase("yes")) || (check.equalsIgnoreCase("y")));
        return (check.equalsIgnoreCase("yes")) || (check.equalsIgnoreCase("y"));
    }
    public static int getInt(int min, int max){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Choose a number between " + min + " and " + max);
        int input = scan.nextInt();
        if ((input >= min)&&(input<=max)){
            return input;
        } else getInt(min, max);
        return input;
    }
    public static int getInt(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter a number.");
        int input = scan.nextInt();
        return input;
    }
    public static double getDouble(double min, double max){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Choose a number between " + min + " and " + max);
        double input = scan.nextDouble();
        if ((input >= min)&&(input<=max)){
            return input;
        } else getDouble(min, max);
        return input;
    }
    public static double getDouble(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter a number.");
        double input = scan.nextDouble();
        return input;
    }
        // END OF EVERYTHING

}
