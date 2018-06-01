package bootcamp.movierental;

import java.util.Arrays;
import java.util.List;

public class MovieRepository {
    public List<Movie> all() {
        return Arrays.asList(new Movie("The Shawshank Redemption", 20),
                new Movie("The Godfather", 20),
                new Movie("The Godfather : Part II", 20),
                new Movie("The Dark Knight", 20),
                new Movie("12 Angry Men", 20),
                new Movie("Schindler's List", 20),
                new Movie("Pulp Fiction", 20));
    }
}
