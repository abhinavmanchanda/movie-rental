package bootcamp.movierental;

import java.util.Objects;

public class Movie {
    private String name;
    private int cost;

    public Movie(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return cost == movie.cost &&
                Objects.equals(name, movie.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }
}
