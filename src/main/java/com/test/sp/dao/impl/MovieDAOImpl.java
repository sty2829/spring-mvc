package com.test.sp.dao.impl;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.test.sp.dao.MovieDAO;
import com.test.sp.entity.MovieInfo;
import com.test.sp.util.CommonEntityManager;

@Repository
public class MovieDAOImpl implements MovieDAO {

	@Override
	public List<MovieInfo> getMovieInfoList() {
		EntityManager em = CommonEntityManager.getEM();
		TypedQuery<MovieInfo> miTQ = em.createQuery("from MovieInfo order by miNum", MovieInfo.class);
		List<MovieInfo> movieList = miTQ.getResultList();
		em.close();
		return movieList;
	}

	@Override
	public MovieInfo getMovieInfo(long miNum) {
		EntityManager em = CommonEntityManager.getEM();
		TypedQuery<MovieInfo> miTQ = em.createQuery("from MovieInfo where miNum = :miNum", MovieInfo.class);
		miTQ.setParameter("miNum", miNum);
		MovieInfo movieInfo = miTQ.getSingleResult();
		em.close();
		return movieInfo;
	}

	@Override
	public int insertMovieInfo(MovieInfo movieInfo) {
		EntityManager em = CommonEntityManager.getEM();
		EntityTransaction et = em.getTransaction();
		int cnt = 1;
		try {
			et.begin();
			em.persist(movieInfo);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
			cnt = 0;
		} finally {
			em.close();
		}
		return cnt;
	}

	@Override
	public int updateMovieInfo(MovieInfo movieInfo) {
		EntityManager em = CommonEntityManager.getEM();
		EntityTransaction et = em.getTransaction();
		int cnt = 1;
		try {
			et.begin();
			em.merge(movieInfo);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
			cnt = 0;
		} finally {
			em.close();
		}
		return cnt;
	}

	@Override
	public int deleteMovieInfo(long miNum) {
		EntityManager em = CommonEntityManager.getEM();
		EntityTransaction et = em.getTransaction();
		int cnt = 1;
		try {
			et.begin();
			TypedQuery<MovieInfo> miTQ = em.createQuery("from MovieInfo where miNum = :miNum", MovieInfo.class);
			miTQ.setParameter("miNum", miNum);
			MovieInfo movieInfo = miTQ.getSingleResult();
			em.remove(movieInfo);
			et.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			cnt = 0;
		} finally {
			em.close();
		}
		return cnt;
	}

}
