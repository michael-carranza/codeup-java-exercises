import java.util.Scanner;
public class JavaPractice {
    public static void main(String[] args) {
// CALL YOUR METHODS HERE
//       firstChar("Tacos");
//       secondChar("Tacos");
//       lastChar("Tacos");
//       secondToLastChar("Tacos");
//       userWantsToContinue();
//       isEven(5);
//       isOdd(5);
//       countOdds(1,10);
//       countEvens(1,10);
//        isVowel();
//        isVowel("ab");
//        hasVowel("Tacos");
        countVowels("Tacos");
//END OF METHOD CALLS
    }
//BUILD YOUR METHODS HERE
        //Write a method named firstChar() that takes a string as an input and returns the first letter as               a character data type.
    public static char firstChar(String a){
        char first = a.charAt(0);
        System.out.println("The first character in " + a + " is: " + first);
        return first;
    }
        //Write a method named secondChar() that takes a string as an input and returns the first letter as a           character data type.
        public static char secondChar(String a){
            char second = a.charAt(1);
            System.out.println("The second character in " + a + " is: " + second);
            return second;
        }
        //Write a method named lastChar() that takes a string as an input and returns the last letter as a              character data type.
        public static char lastChar(String a){
            int length = a.length();
            char last = a.charAt(length-1);
            System.out.println("The last character in " + a + " is: " + last);
            return last;
        }
        //Write a method named secondToLastChar() that takes a string as an input and returns the second to letter      as a character data type.

        public static char secondToLastChar(String a){
            int length = a.length();
            char penultimate = a.charAt(length-2);
            System.out.println("The penultimate character in " + a + " is: " + penultimate);
            return penultimate;
        }
        //Write a method named userWantsToContinue(). This method should prompt the user if they want to continue       and then return a boolean value if the user inputs "y" or "yes".

        public static boolean userWantsToContinue(){
            Scanner scan = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Would you like to continue?");
            String keepGoing=scan.next();
            boolean userWantsToContinue= (keepGoing.equalsIgnoreCase("yes"))
                    || (keepGoing  .equalsIgnoreCase("y"));
            System.out.println(userWantsToContinue);
            return userWantsToContinue;
        }
        //Write a method named isEven() that takes in an integer and returns a boolean if the input is even or not.
        public static boolean isEven(int num){
            boolean check = (num % 2 == 0);
            System.out.println("Is " + num + " an even number?");
            System.out.println(check);
            return check;
        }
        //Write a method named isOdd() that takes in an integer and returns a boolean if the input is odd or not.
        public static boolean isOdd(int num){
            boolean check = (num % 2 != 0);
            System.out.println("Is " + num + " an odd number?");
            System.out.println(check);
            return check;
        }
        //Write a method named countOdds(start, end) that returns an integer containing the integer that is the         count of all odd numbers between the start and the end input integers.
        public static int countOdds(int start,int end){
            int odds=0;
            System.out.println("How many odd numbers are between " + start + " and " + end + "?");
            do {
                boolean oddCheck = (start % 2 != 0);
                    if (oddCheck){
                        start++;
                        odds++;
                    }else{start+=1;}
            }while(start<=end);
            System.out.println("There are " + odds + " odd numbers in that range.");
                return odds;
        }
        //Write a method named countEvens(start, end) that returns an integer containing the integer that is the        count of all even numbers between the start and the end input integers.
        public static int countEvens(int start,int end){
            int evens=0;
            System.out.println("How many even numbers are between " + start + " and " + end + "?");
            do {
                boolean evenCheck = (start % 2 == 0);
                if (evenCheck){
                    start++;
                    evens++;
                }else{start+=1;}
            }while(start<=end);
            System.out.println("There are " + evens + " even numbers in that range.");
            return evens;
        }
         //Write a method named isVowel() that accepts a String input of length 1 and returns a boolean if that         string is a vowel other than "y".
//        public static boolean checkForVowel(){
//            Scanner scan = new Scanner(System.in).useDelimiter("\n");
//            System.out.println("Please type a single letter.");
//            String userInput=scan.next();
//                if (userInput.length()!=1){
//                    System.out.println("Please type a single letter.");
//                    return isVowel();
//                }
//                boolean vowelCheck = (userInput.equalsIgnoreCase("a") ||
//                        userInput.equalsIgnoreCase("e") ||
//                        userInput.equalsIgnoreCase("i") ||
//                        userInput.equalsIgnoreCase("o") ||
//                        userInput.equalsIgnoreCase("u") );
//
//                if (vowelCheck){
//                    System.out.println("You entered: " + userInput);
//                    System.out.println("That IS a vowel!");
//                    return (vowelCheck);
//                } else {
//                    System.out.println("You entered: " + userInput);
//                    System.out.println("That is NOT a vowel!");
//                    return (vowelCheck);
//                }
//        }

        // Write a method named isVowel() that accepts a String input of length 1 and returns a boolean if that         string is a vowel other than "y".
        // public static boolean checkForVowel(){
        public static boolean isVowel(String a){
            boolean vowelCheck = (a.equalsIgnoreCase("a") ||
                    a.equalsIgnoreCase("e") ||
                    a.equalsIgnoreCase("i") ||
                    a.equalsIgnoreCase("o") ||
                    a.equalsIgnoreCase("u") );
//            System.out.println(vowelCheck);
            return vowelCheck;
        }
        //Write a method named hasVowels() that accepts a string of any length and returns a boolean if
        // there are any vowels in that string.
        public static boolean hasVowel(String a) {
            for (int i=0;i<a.length();i++){
                String letter = Character.toString(a.charAt(i));
                if(isVowel(letter)){
                    System.out.println(true);
                    return true;}
            }
            System.out.println(false);
            return false;
        }

    //Write a method named hasVowels() that accepts a string of any length and returns a boolean if
    // there are any vowels in that string.
    public static int countVowels(String a) {
        int vowels = 0;
        for (int i = 0; i < a.length(); i++) {
            String letter = Character.toString(a.charAt(i));
            if (isVowel(letter)) {
                vowels++;
            }
        }System.out.println(vowels);
        return vowels;
    }
    //END OF EVERYTHING
}
