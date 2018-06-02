package bootcamp.movierental;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class MovieRepository {
    public List<Movie> all() {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("movies");
        EntityManager em = emFactory.createEntityManager();
        Query query = em.createQuery("SELECT m FROM Movie m");
        List<Movie> movies = query.getResultList();
        em.close();
        return movies;
    }
}
