package bootcamp.movierental;

import java.util.HashMap;

public class MovieRentalApplication {
    public HashMap<String, Integer> list() {
        return new HashMap<String, Integer>(){{
            put("The Shawshank Redemption", 20);
            put("The Godfather", 20);
            put("The Godfather : Part II", 20);
            put("The Dark Knight", 20);
            put("12 Angry Men", 20);
            put("Schindler's List", 20);
            put("Pulp Fiction", 20);
        }};
    }
}
