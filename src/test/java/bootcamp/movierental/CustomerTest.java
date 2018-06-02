package bootcamp.movierental;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void shouldBeAbleToRentAMovie(){
        Customer customer = new Customer();
        Movie movie = new Movie("m1", 20);
        customer.rent(movie);
        assertEquals(asList(movie), customer.rentedMovies());
    }
}