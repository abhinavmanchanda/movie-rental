package bootcamp.movierental;

import java.util.List;

public class MovieRentalApplication {
    public List<Movie> list() {

        return new MovieRepository().all();
    }

}
