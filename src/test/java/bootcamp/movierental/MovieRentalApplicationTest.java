package bootcamp.movierental;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class MovieRentalApplicationTest {

    @Test
    public void viewTheListOfMovieNamesAvailable(){
        List<String> expectedMovies = Arrays.asList("The Shawshank Redemption", "The Godfather",
                "The Godfather : Part II", "The Dark Knight",
                "12 Angry Men", "Schindler's List", "Pulp Fiction");
        MovieRentalApplication movieRentalApplication = new MovieRentalApplication();
        List<String> actualMovies = movieRentalApplication.list();
        assertEquals(7, actualMovies.size());
        assertEquals(expectedMovies, actualMovies);

    }

}