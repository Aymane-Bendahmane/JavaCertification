package ComparisonTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static final List<Movie> movies = new ArrayList<>();
    public static void main(String[] args) {
        movies.add(new Movie("The sopranos",1999,9));
        movies.add(new Movie("The wire",2002,8));
        movies.add(new Movie("Succession",2020,7));

        // using comparable
        Collections.sort(movies);

        // using comparator
        System.out.println("sorting by rating");
        RatingComparator ratingComparator = new RatingComparator();
        movies.sort(ratingComparator);
        movies.forEach(System.out::println);

        System.out.println("sorting by year");
        YearComparator yearComparator = new YearComparator();
        movies.sort(yearComparator);
        movies.forEach(System.out::println);

        //using lambda
        System.out.println("sorting by rating using lambda");
        movies.sort(LambdaComparator.ratingComparator);
        movies.forEach(System.out::println);
        System.out.println("sorting by year using lambda");
        movies.sort(LambdaComparator.yearComparator);
        movies.forEach(System.out::println);
    }
}
