package bootcamp.movierental;

import java.util.List;

public class MovieRentalApplication {

    private MovieRepository movieRepository;

    public MovieRentalApplication(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> list() {
        return movieRepository.all();
    }

}
