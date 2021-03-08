package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.test.sp.entity.GameInfo;

public class GameInfoTest {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("com.test.sp");
		EntityManager em = emFactory.createEntityManager();
		TypedQuery<GameInfo> tq = em.createQuery("select gi from GameInfo gi", GameInfo.class);
		List<GameInfo> gameList = tq.getResultList();
		System.out.println(gameList);
		em.close();
		emFactory.close();
	}
	
}
