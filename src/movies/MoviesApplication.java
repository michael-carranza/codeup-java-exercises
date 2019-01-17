package src.movies;
import util.Input;



public class MoviesApplication {
        static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        boolean keepGoing = false;
    do {
        System.out.println("What would you like to do?\n");
        System.out.println("0 - Exit");
        System.out.println("1 - View All Movies");
        System.out.println("2 - View All Animated Movies");
        System.out.println("3 - View All Drama Movies");
        System.out.println("4 - View All Horror Movies");
        System.out.println("5 - View All Sci-Fi Movies");
//        System.out.println("6 - Add a Movie");
        System.out.println();
        int choice = Input.getInt(0, 5, "Please make a selection.");
        if (choice == 0){keepGoing=false;}
        if (choice == 1) {
            System.out.println("You have selected ALL categories.");
            display(movies);
             keepGoing = Input.yesNo("Would you like to search again?");
        }
        if (choice == 2) {
            System.out.println("You have selected the ANIMATED category.");
            searchBy("animated");
             keepGoing = Input.yesNo("Would you like to search again?");
        }
        if (choice == 3) {
            System.out.println("You have selected the DRAMA category.");
            searchBy("drama");
            keepGoing = Input.yesNo("Would you like to search again?");
        }
        if (choice == 4) {
            System.out.println("You have selected the HORROR category.");
            searchBy("horror");
            keepGoing = Input.yesNo("Would you like to search again?");
        }
        if (choice == 5) {
            System.out.println("You have selected the SCI-FI category.");
            searchBy("scifi");
            keepGoing = Input.yesNo("Would you like to search again?");
        }
//        if (choice == 6) {
//            System.out.println("You have chosen to add a movie.");
//            movies=addMovie(movies);
//            keepGoing = Input.yesNo("Would you like to search for a movie?");
//        }
    }while (keepGoing);
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
            System.out.println(result[i].getTitle() + " -- " + result[i].getCategory());
        }
    }

//    public static Movie[] addMovie(Movie[] movies){
//            System.out.println("Adding a new movie now.");
//        Scanner scan = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Please enter a movie title.");
//        String newTitle = scan.next();
//        System.out.println("Please enter a movie category.");
//        String newCategory = scan.next();
//
//            int length = movies.length;
//            Movie[] newMovies = new Movie[length+1];
//            int i = 0;
//            while (i<movies.length) {
//                newMovies[i] = movies[i];
//                i++;
//            }
//            newMovies[length+1]= new Movie(newTitle,newCategory);
//            return newMovies;
//        }


    // END OF EVERYTHING
}
