package bootcamp.movierental;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.*;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MovieRentalApplicationTest {

    @Mock
    private MovieRepository movieRepository;
    private MovieRentalApplication application;

    @Before
    public void setup(){
        application = new MovieRentalApplication(movieRepository);
    }

    @Test
    public void returnMovieListProvidedByTheRepository() {
        List<Movie> movies = new ArrayList<Movie>() {{
            add(new Movie("movie2", 40));
            add(new Movie("movie1", 10));
        }};
        Customer customer = new Customer();
        when(movieRepository.all()).thenReturn(movies);
        List<MovieListing> returnedMovies = application.list(customer);
        assertEquals(movies.stream().map(movie -> new MovieListing(movie, Status.AVAILABLE)), returnedMovies);
    }

    @Test
    public void whenTheUserRentsAMovieDisplayItsStatusAsRented(){
        Customer customer = new Customer();
        Movie movie2 = new Movie("movie2", 40);
        Movie movie1 = new Movie("movie1", 10);
        List<MovieListing> movies = new ArrayList<MovieListing>() {{
            add(new MovieListing(movie1, Status.RENTED));
            add(new MovieListing(movie2,Status.AVAILABLE));
        }};
        application.rent(customer, movie1);
        when(movieRepository.all()).thenReturn(Arrays.asList(movie1, movie2));
        List<MovieListing> actualMovies = application.list(customer);
        assertEquals(movies, actualMovies);
    }

}