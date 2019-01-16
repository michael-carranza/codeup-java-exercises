package src.movies;

public class Movie {

    // constructor
    public String title;
    public String category;
    public Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }

    // GETTER
    // returns the person's title
    public String getTitle(){return this.title;}
    public String getCategory(){return this.category;}

    //SETTER
    // changes the title property to the passed value
    public void setTitle(String title){
        this.title = title;
    }
    public void setCategory(String category){ this.category = category;
    }
}
