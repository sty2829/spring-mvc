package com.test.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sp.dao.MovieDAO;
import com.test.sp.entity.MovieInfo;
import com.test.sp.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDAO movieDAO;
	
	@Override
	public List<MovieInfo> getMovieInfoList() {
		return movieDAO.getMovieInfoList();
	}

}
