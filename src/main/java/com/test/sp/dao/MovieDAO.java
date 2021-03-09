package com.test.sp.dao;

import java.util.List;

import com.test.sp.entity.MovieInfo;

public interface MovieDAO {

	List<MovieInfo> getMovieInfoList();
	
	MovieInfo getMovieInfo(long miNum);
	
	int insertMovieInfo(MovieInfo movieInfo);
	
	int updateMovieInfo(MovieInfo movieInfo);
	
	int deleteMovieInfo(long miNum);
}
