import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        boolean keepGoing;
        do {
            System.out.println("Say something to Bob.");
            String message = scan.next();
            int length = message.length();
            if (message.endsWith("?")) {
                System.out.println("Sure.");
            }
            else if (message.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            }
            else if (length == 0) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }

            System.out.println("Would you like to keep talking to Bob?");
            String response = scan.next();
            keepGoing = response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");
        } while(keepGoing);
    }
}
