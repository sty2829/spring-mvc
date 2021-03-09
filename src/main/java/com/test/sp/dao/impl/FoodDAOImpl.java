package com.test.sp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.test.sp.dao.FoodDAO;
import com.test.sp.entity.FoodInfo;
import com.test.sp.util.CommonEntityManager;

@Repository
public class FoodDAOImpl implements FoodDAO {

	@Override
	public List<FoodInfo> getFoodInfoList() {
		EntityManager em = CommonEntityManager.getEM();
		TypedQuery<FoodInfo> fiTQ = em.createQuery("from FoodInfo", FoodInfo.class);
		List<FoodInfo> foodList = fiTQ.getResultList();
		em.close();
		return foodList;
	}
	
	@Override
	public int insertFoodInfo(FoodInfo food) {
		EntityManager em = CommonEntityManager.getEM();
		EntityTransaction et = em.getTransaction();
		int cnt = 1;
		try {
			et.begin();
			em.persist(food);
			et.commit();
		} catch(Exception e) {
			e.printStackTrace();
			cnt = 0;
		} finally {
			em.close();
		}
		return cnt;
	}
	
	@Override
	public FoodInfo getFoodInfo(long fiNum) {
		EntityManager em = CommonEntityManager.getEM();
		TypedQuery<FoodInfo> fiTQ = em.createQuery("from FoodInfo where fiNum = :fiNum", FoodInfo.class);
		fiTQ.setParameter("fiNum", fiNum);
		FoodInfo foodInfo = fiTQ.getSingleResult();
		return foodInfo;
	}

	@Override
	public int updateFoodInfo(FoodInfo food) {
		EntityManager em = CommonEntityManager.getEM();
		EntityTransaction et = em.getTransaction();
		int cnt = 1;
		try {
			et.begin();
			em.merge(food);
			et.commit();
		} catch(Exception e) {
			e.printStackTrace();
			cnt = 0;
		} finally {
			em.close();
		}
		return cnt;
	}

	@Override
	public int deleteFoodInfo(long fiNum) {
		EntityManager em = CommonEntityManager.getEM();
		EntityTransaction et = em.getTransaction();
		int cnt = 1;
		try {
			TypedQuery<FoodInfo> fiTQ = em.createQuery("from FoodInfo where fiNum = :fiNum", FoodInfo.class);
			fiTQ.setParameter("fiNum", fiNum);
			FoodInfo foodInfo = fiTQ.getSingleResult();
			et.begin();
			em.remove(foodInfo);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
			cnt = 0;
		} finally {
			em.close();
		}
		return cnt;
	}
	public static void main(String[] args) {
		FoodDAO foodDAO = new FoodDAOImpl();
		
	}


	

	
	
}
