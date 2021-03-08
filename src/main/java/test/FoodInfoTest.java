package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.test.sp.entity.FoodInfo;
import com.test.sp.util.CommonEntityManager;

public class FoodInfoTest {

	public static void main(String[] args) {
		EntityManager em = CommonEntityManager.getEM();
		String sql = "from FoodInfo order by fiNum";
		TypedQuery<FoodInfo> tq = em.createQuery(sql, FoodInfo.class);
		List<FoodInfo> fiList = tq.getResultList();
		System.out.println(fiList);
		em.close();
		
		
	}
}
