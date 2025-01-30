package ComparisonTypes;

public class Movie implements Comparable<Movie> {
    private String title;
    private int year;
    private int rating;

    public Movie(String title, int year, int rating) {
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    @Override
    public int compareTo(Movie o) {
        return this.year - o.getYear();
    }

    @Override
    public String toString() {
        return "**Title : " + title +
               "\nYear  : " + year +
               "\nRating: " + rating;
    }
}
