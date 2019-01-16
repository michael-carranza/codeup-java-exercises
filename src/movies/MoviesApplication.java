package src.movies;
import util.Input;
import java.util.Arrays;

public class MoviesApplication {
        static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        System.out.println("What would you like to do?\n");
        System.out.println("0 - Exit");
        System.out.println("1 - View All Movies");
        System.out.println("2 - View All Animated Movies");
        System.out.println("3 - View All Drama Movies");
        System.out.println("4 - View All Horror Movies");
        System.out.println("5 - View All Sci-Fi Movies");
        System.out.println();
        int choice = Input.getInt(0, 5, "Please make a selection.");
        if (choice == 1){
            System.out.println("You have selected ALL categories.");
            display(movies);
        }
        if (choice == 2){
            System.out.println("You have selected the ANIMATED category.");
            searchBy("animated");
        }
        if (choice == 3){
            System.out.println("You have selected the DRAMA category.");
            searchBy("drama");
        }
        if (choice == 4){
            System.out.println("You have selected the HORROR category.");
            searchBy("horror");
        }
        if (choice == 5){
            System.out.println("You have selected the SCI-FI category.");
            searchBy("scifi");
        }

    }
    public static int arraySize(String category){
        int arraySize=0;
        for (int i = 0;i< movies.length;i++){
                if (movies[i].getCategory().equals(category)) {
                    arraySize++;
            }
        }
        return arraySize;
     }// end of method

    public static Movie[] searchBy(String category){
        int length = arraySize(category);
        Movie[] result = new Movie[length];
        int counter = 0;
        for (int i=0;i<movies.length;i++){
            if (movies[i].getCategory().equals(category)){
                result[counter] = new Movie(movies[i].getTitle(),category);
                counter++;
            }
        }
        display(result);
        return result;
    }
    public static void display(Movie[]result){
        System.out.println("We found " + result.length + " movies in our list.");
        System.out.println("Here they are:");
        for(int i = 0;i<result.length;i++){
            System.out.println(result[i].getTitle());
        }
    }
    // END OF EVERYTHING
}
