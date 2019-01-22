package util;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//    getString();
//    yesNo();
    getInt(1,50, "Please enter a number.");
//    getInt();
//    getDouble(1,50,"Please enter a number.");
//    getDouble();
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
    public static int getInt(int min, int max) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
            String input = scan.next();
            int num = 0;
        try{
            num = Integer.valueOf(input);
            if ((num >= min) && (num <= max)) {
                return num;
            } else getInt(min, max);
            return num;
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
        return num;
    }
    public static int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        return getInt(min, max);
    }
    public static int getInt(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Please enter a number.");
            String input = scan.next();
            int check = 0;
        try {
            check = Integer.valueOf(input);
            return check;
        } catch (NumberFormatException ex) {
            System.out.println("Please make sure your number is a valid integer in numerals.");
            return getInt();
        }
    }
    public static double getDouble(double min, double max){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        String input = scan.next();
        double num = 0;
        try{
            num = Double.valueOf(input);
            if ((num >= min) && (num <= max)) {
                return num;
            } else getDouble(min, max);
            return num;
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
        return num;
    }
    public static double getDouble(double min, double max, String prompt){
        System.out.println(prompt);
        return getDouble(min, max);
    }

    public static double getDouble(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter a number.");
        String input = scan.next();
        double check = 0;
        try {
            check = Double.valueOf(input);
            return check;
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
        System.out.println(check);
        return check;
    }
        // END OF EVERYTHING

}
