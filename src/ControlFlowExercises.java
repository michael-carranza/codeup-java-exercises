import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
//        While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15
        System.out.println("While Loop");
        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }

//        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536

        System.out.println("\nDo While Loop");

        // 0 to 100 by 2
//        int j = 0;
//        do {
//            System.out.println(j);
//            j+=2;
//        } while (j<=100);

        // DOWN FROM 100 by 5
//        int j = 100;
//        do {
//            System.out.println(j);
//            j-=5;
//        } while (j>=-10);
        for (int l = 100; l >= -10; l -= 5) {
            System.out.println(l);
        }

        // SQUARES UNDER 100,000
//        long k = 2;
//        do {
//            System.out.println(k);
//            k = k*k;
//        } while (k < 1000000);
        for (long m = 2; m < 1000000; m = m * m) {
            System.out.println(m);
        }

//FIZZ BUZZ

//        for (int count = 1; count <= 100; count++) {
//            if (count % 3 == 0) {
//                if (count % 5 == 0) {
//                    System.out.println("FizzBuzz");
//                } else {
//                    System.out.println("Fizz");
//                }
//            } else if (count % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(count);
//            }
//        }
// END OF FIZZBUZZ
//
//        System.out.println("What number would you like to go up to?\n");
//        int numChoice = scan.nextInt();
//        System.out.println("Here is your table!\n");
//        System.out.println(" -------   -------   -----  ");
//        System.out.println("| Number | Squared | Cubed |");
//        System.out.println(" -------   -------   -----  ");
//
//        for (int count=1;count<=numChoice;count++){
//            int squared = count * count;
//            int cubed = count * count * count;
//            System.out.println(count + "        | " + squared + "       | " + cubed);
//        }
// END OF FIRST TABLE
        boolean keepGoing=true;
        do {
            System.out.println("What is your grade? (1 to 100)");
            int numGrade = scan.nextInt();
            if (numGrade >= 88 && numGrade <= 100) {
                System.out.println("Your letter grade is: A.");
            } else if (numGrade >= 80 && numGrade <= 87) {
                System.out.println("Your letter grade is: B.");
            } else if (numGrade >= 67 && numGrade <= 79) {
                System.out.println("Your letter grade is: C.");
            } else if (numGrade >= 60 && numGrade <= 66) {
                System.out.println("Your letter grade is: D.");
            } else if (numGrade > 0 && numGrade <= 59) {
                System.out.println("Your letter grade is: B.");
            } else {
                System.out.println("Please enter a number between 1 and 100.");
            }
                System.out.println("Would you like to enter another grade?");
                String otherGrade = scan.next();
                keepGoing = otherGrade.equalsIgnoreCase("yes") || otherGrade.equalsIgnoreCase("y");

        } while(keepGoing);

    }
}
