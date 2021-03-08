package com.test.sp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.sp.entity.MovieInfo;
import com.test.sp.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public String movieList(Model model) {
		model.addAttribute("movieList", movieService.getMovieInfoList());
		return "/movie/list";
	}
	
	@RequestMapping(value = "/movie/insert", method = RequestMethod.GET)
	public String goInsert() {
		return "/movie/insert";
	}
	
	@RequestMapping(value = "/movie/insert", method = RequestMethod.POST)
	public String insert(MovieInfo movie) {
		System.out.println(movie);
		return "/movie/insert";
	}
	
}
