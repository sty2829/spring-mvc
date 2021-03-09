package com.test.sp.service;

import java.util.List;

import com.test.sp.entity.MovieInfo;

public interface MovieService {

	List<MovieInfo> getMovieInfoList();
	
	MovieInfo getMovieInfo(long miNum);
	
	int insertMovieInfo(MovieInfo movieInfo);
	
	int updateMovieInfo(MovieInfo movieInfo);
	
	int deleteMovieInfo(long miNum);
}
