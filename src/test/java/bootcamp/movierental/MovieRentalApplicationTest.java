package bootcamp.movierental;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MovieRentalApplicationTest {

    @Mock
    private MovieRepository movieRepository;

    @Test
    public void returnMovieListProvidedByTheRepository() {
        MovieRentalApplication application = new MovieRentalApplication(movieRepository);
        List<Movie> movies = new ArrayList<Movie>() {{
            add(new Movie("movie2", 40));
            add(new Movie("movie1", 10));
        }};
        when(movieRepository.all()).thenReturn(movies);
        List<Movie> returnedMovies = application.list();
        assertEquals(movies, returnedMovies);
    }

}