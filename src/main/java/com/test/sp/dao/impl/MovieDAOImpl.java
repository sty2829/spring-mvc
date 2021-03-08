package com.test.sp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
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
		return movieList;
	}
	
	public static void main(String[] args) {
		MovieDAO movieDAO = new MovieDAOImpl();
		System.out.println(movieDAO.getMovieInfoList());
		
	}

}
