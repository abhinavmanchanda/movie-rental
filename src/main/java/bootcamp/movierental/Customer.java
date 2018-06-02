package bootcamp.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private List<Movie> rentedMovies = new ArrayList<>();

    public List<Movie> rentedMovies() {
        return rentedMovies;
    }

    public void rent(Movie movie) {
        rentedMovies.add(movie);
    }
}
