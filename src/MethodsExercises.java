import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
//        addition(2,3);
//        subtraction(5,3);
        System.out.println(multiplication(7, 4));
//        division(6,3);
//        modulus(15,3);
//        getInteger(1,10);
//        factorial(4);
//        diceRoller();
    }
    public static int addition (int a, int b){
        System.out.println(a+b);
        return a+b;
    }
    public static int subtraction (int a, int b){
        System.out.println(a-b);
        return a-b;
    }
    public static int multiplication (int a, int b){
//      STANDARD VERSION
//        System.out.println(a*b);
//        return a*b;
//      LOOP VERSION
//        int result = 0;
//        for (int i = 1;i<=b;i++){
//            result += a;
//        }
//        System.out.println(result);return result;
//      RECURSION VERSION
        if (a < b)
            return multiplication(b, a);
        else if (b != 0)
            return (a + multiplication(a, b - 1));
        else{
            return 0;
    }}
    public static int division (int a, int b){
        System.out.println(a/b);
        return a/b;
    }
    public static int modulus (int a, int b){
        System.out.println(a%b);
        return a%b;
    }
    public static boolean getInteger(int a,int b){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Enter a number between 1 and 10: ");
        int userInput= scan.nextInt();
        System.out.println((userInput >= a && userInput <= b));
        return (userInput>=a && userInput<=b);
    }
//    public static int factorial(int a){
//        Scanner scan = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Please enter a number between one and 10.");
//        int userInput= scan.nextInt();
//        int total = 1;
//        String result = userInput+"! = ";
//        for (int counter = 1;counter<=userInput;counter++){
//            total = total * counter;
//        }
//        for (int count = 1;count <=userInput;count++){
//            result += count + " x ";
//        }
//        result = result + "= " + total;
//        System.out.println(total);
//        System.out.println(result);
//        return total;
//    }

    public static int factorial(int a){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter a number between one and 10.");
        int userInput= scan.nextInt();
        int total = 1;
        String result = userInput+"! = ";
//        for (int counter = 1;counter<=userInput;counter++){
//            total = total * counter;
//        }


        for (int count = 1;count <=userInput;count++){
            result += count + " x ";
        }
        result = result + "= " + total;
        System.out.println(total);
        System.out.println(result);
        return total;
    }
    public static String diceRoller() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        boolean begin;
        String result;
        do {
            System.out.println("How many sides do your dice have?");
            int userInput = scan.nextInt();
            double die1 = (int) (Math.random() * ((userInput - 1) + 1)) + 1;
            double die2 = (int) (Math.random() * ((userInput - 1) + 1)) + 1;
            System.out.println("You rolled a " + die1 + " and a " + die2 + ".");
            result="You rolled a " + die1 + " and a " + die2 + ".";
            System.out.println("Would you like to roll again?");
            String reroll = scan.next();
            begin = reroll.equalsIgnoreCase("yes") || reroll.equalsIgnoreCase("y");
        } while (begin);
        return result;
    }
}

