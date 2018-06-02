package bootcamp.movierental;


import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class MovieRepositoryTest {
    @Before
    public void setup(){
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("movies");
        EntityManager em = emFactory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.createQuery("DELETE from Movie movie").executeUpdate();
        transaction.commit();
        em.close();

    }

    @Test
    public void shouldReturnTheListOfAvailableMovies(){
        Movie movie1 = new Movie("m1", 10);
        Movie movie2 = new Movie("m2", 30);
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("movies");
        EntityManager em = emFactory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        movie1 = em.merge(movie1);
        movie2 = em.merge(movie2);
        transaction.commit();
        em.close();

        MovieRepository movieRepository = new MovieRepository();
        List<Movie> movies = movieRepository.all();
        assertEquals(2, movies.size());
        assertEquals(movie1, movies.get(0));
        assertEquals(movie2, movies.get(1));
    }

}
