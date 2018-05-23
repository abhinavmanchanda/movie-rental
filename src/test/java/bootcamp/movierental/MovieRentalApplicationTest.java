package bootcamp.movierental;

import org.junit.Test;

import java.util.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class MovieRentalApplicationTest {

    @Test
    public void returnPriceAlongWithTheMovieList(){
        Map<String, Integer> expectedMovies = new HashMap<String, Integer>(){{
            put("The Shawshank Redemption", 20);
            put("The Godfather", 20);
            put("The Godfather : Part II", 20);
            put("The Dark Knight", 20);
            put("12 Angry Men", 20);
            put("Schindler's List", 20);
            put("Pulp Fiction", 20);
        }};

        MovieRentalApplication movieRentalApplication = new MovieRentalApplication();
        HashMap<String, Integer> actualMovies = movieRentalApplication.list();
        assertEquals(7, actualMovies.size());
        assertEquals(expectedMovies, actualMovies);

    }

}