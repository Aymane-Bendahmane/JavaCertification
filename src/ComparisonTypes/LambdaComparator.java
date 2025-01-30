package ComparisonTypes;

import java.util.Comparator;

public class LambdaComparator {
   public static Comparator<Movie> ratingComparator = Comparator.comparingInt(Movie::getRating);
   public static Comparator<Movie> yearComparator = Comparator.comparingInt(Movie::getYear);

}
