package bootcamp.movierental;

import org.junit.Test;

import java.util.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class MovieRentalApplicationTest {

    @Test
    public void returnPriceAlongWithTheMovieList(){
        List<Movie> expected = Arrays.asList(new Movie("The Shawshank Redemption", 20),
                new Movie("The Godfather", 20),
                new Movie("The Godfather : Part II", 20),
                new Movie("The Dark Knight", 20),
                new Movie("12 Angry Men", 20),
                new Movie("Schindler's List", 20),
                new Movie("Pulp Fiction", 20));

        MovieRentalApplication movieRentalApplication = new MovieRentalApplication();
        List<Movie> actual = movieRentalApplication.list();
        assertEquals(7, actual.size());
        assertEquals(expected, actual);
    }

}