package bootcamp.movierental;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class MovieRepositoryTest {

    @Test
    public void shouldReturnTheListOfAvailableMovies(){
        List<Movie> expected = Arrays.asList(new Movie("The Shawshank Redemption", 20),
                new Movie("The Godfather", 20),
                new Movie("The Godfather : Part II", 20),
                new Movie("The Dark Knight", 20),
                new Movie("12 Angry Men", 20),
                new Movie("Schindler's List", 20),
                new Movie("Pulp Fiction", 20));

        MovieRepository movieRepository = new MovieRepository();
        List<Movie> actual = movieRepository.all();
        assertEquals(7, actual.size());
        assertEquals(expected, actual);
    }
}