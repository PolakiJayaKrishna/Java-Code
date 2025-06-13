//Build a Movie class with private title and rating. Provide access using getter/setter.

package Encapsulation;

public class Movie {
    private String title;
    private int rating;

    public void setMovieName(String name) {
        this.title = name;
    }

    public void setRating(int rating) {
        if (rating >= 0 && rating <= 10)
            this.rating = rating;
        else
            System.out.println("Invalid input...");
    }

    public String getMovieName() {
        return this.title;
    }

    public int getRating() {
        return this.rating;
    }

    public void display() {
        System.out.println("Movie Name is: " + getMovieName());
        System.out.println("Movie Rating is: " + getRating() + "/10");
    }

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setMovieName("Devara");
        movie.setRating(4);
        movie.display();
    }
}
