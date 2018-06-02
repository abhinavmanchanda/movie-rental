package bootcamp.movierental;

import java.util.Objects;

public class MovieListing {


    private final Movie movie;
    private final Status available;

    public MovieListing(Movie movie, Status available) {

        this.movie = movie;
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieListing that = (MovieListing) o;
        return Objects.equals(movie, that.movie) &&
                available == that.available;
    }

    @Override
    public int hashCode() {

        return Objects.hash(movie, available);
    }
}
