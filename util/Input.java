package util;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
    getString();
    yesNo();
    getInt(1,50, "Please enter a number.");
    getInt();
    getDouble(1,50,"Please enter a number.");
    getDouble();
    }
    public static String getString(){
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
        String input = scan.next();
        return input;
    }
    public static String getString(String prompt){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println(prompt);
        return getString();
    }
    public static boolean yesNo(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        String check = scan.next();
        return (check.equalsIgnoreCase("yes")) || (check.equalsIgnoreCase("y"));
    }
    public static boolean yesNo(String prompt){
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        String check = scan.next();
        return (check.equalsIgnoreCase("yes")) || (check.equalsIgnoreCase("y"));
    }
    public static int getInt(int min, int max){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int input = scan.nextInt();
        if ((input >= min)&&(input<=max)){
            return input;
        } else getInt(min, max);
        return input;
    }
    public static int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        return getInt(min, max);
    }
    public static int getInt(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter a number.");
        int input = scan.nextInt();
        return input;
    }
    public static double getDouble(double min, double max){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        double input = scan.nextDouble();
        if ((input >= min)&&(input<=max)){
            return input;
        } else getDouble(min, max);
        return input;
    }
    public static double getDouble(double min, double max, String prompt){
        System.out.println(prompt);
        return getDouble(min, max);
    }

    public static double getDouble(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter a number.");
        double input = scan.nextDouble();
        return input;
    }
        // END OF EVERYTHING

}
