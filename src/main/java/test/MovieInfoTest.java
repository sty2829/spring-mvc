package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.test.sp.entity.MovieInfo;

public class MovieInfoTest {

	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("com.test.sp");
		EntityManager em = emFactory.createEntityManager();
		String sql = "from MovieInfo where mi_name like :str ";
		TypedQuery<MovieInfo> tq = em.createQuery(sql, MovieInfo.class);
		tq.setParameter("str", "%해적%");
		List<MovieInfo> movieList = tq.getResultList();
		System.out.println(movieList);
		em.close();
		emFactory.close();
		
	}
}
