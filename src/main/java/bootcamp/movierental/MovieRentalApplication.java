package bootcamp.movierental;

import java.util.List;
import java.util.stream.Collectors;

public class MovieRentalApplication {

    private MovieRepository movieRepository;

    public MovieRentalApplication(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieListing> list(Customer customer) {
        return movieRepository.all().stream().map(movie -> {
            Status status = customer.rentedMovies().contains(movie)?Status.RENTED:Status.AVAILABLE;
            return new MovieListing(movie, status);
        }).collect(Collectors.toList());
    }

    public void rent(Customer customer, Movie movie) {
        customer.rent(movie);
    }
}
