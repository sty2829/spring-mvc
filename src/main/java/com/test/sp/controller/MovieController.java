package com.test.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.sp.entity.MovieInfo;
import com.test.sp.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public @ResponseBody List<MovieInfo> getMovieList(){
		return movieService.getMovieInfoList();
	}
}
