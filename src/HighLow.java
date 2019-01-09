import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        double sweetSpot = (int) (Math.random() * ((100 - 1) + 1)) + 1;
        String tooLow = "HIGHER!";
        String tooHigh = "LOWER!";
        String perfect = "GOOD GUESS!";
        boolean playing=true;
        int counter=1;
        do {
            System.out.println("Guess the magic number!");
            double guess = scan.nextDouble();
            if (guess > sweetSpot) {
                System.out.println(tooHigh);
                counter++;
                playing=true;
            }
            if(guess<sweetSpot){
                System.out.println(tooLow);
                counter++;
                playing=true;
            }
            if (guess==sweetSpot){
                System.out.println(perfect);
                System.out.println("It only took you " + counter + " tries.");
                playing=false;
            }
        } while (playing==true);
    }
}
