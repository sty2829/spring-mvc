package com.test.sp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.sp.entity.MovieInfo;
import com.test.sp.service.MovieService;

@Controller
public class MovieControllerJSP {
//
//	@Autowired
//	private MovieService movieService;
//	
//	@RequestMapping(value = "/movies", method = RequestMethod.GET)
//	public String movieList(Model model) {
//		model.addAttribute("movieList", movieService.getMovieInfoList());
//		return "movie/list";
//	}
//	
//	@RequestMapping(value = "/movie/view", method = RequestMethod.GET)
//	public String view(Model model, @RequestParam long miNum) {
//		model.addAttribute("movieInfo", movieService.getMovieInfo(miNum));
//		return "movie/view";
//	}
//	
//	@RequestMapping(value = "/movie/insert", method = RequestMethod.GET)
//	public String goInsert() {
//		return "movie/insert";
//	}
//	
//	@RequestMapping(value = "/movie/insert", method = RequestMethod.POST)
//	public String insert(Model model, MovieInfo movieInfo) {
//		model.addAttribute("result", movieService.insertMovieInfo(movieInfo));
//		return "movie/insert";
//	}
//	
//	@RequestMapping(value = "/movie/update", method = RequestMethod.GET)
//	public String goUpdate(Model model, @RequestParam long miNum) {
//		model.addAttribute("movieInfo", movieService.getMovieInfo(miNum));
//		return "movie/update";
//	}
//	
//	@RequestMapping(value = "/movie/update", method = RequestMethod.POST)
//	public String update(Model model, MovieInfo movieInfo) {
//		model.addAttribute("result", movieService.updateMovieInfo(movieInfo));
//		model.addAttribute("miNum", movieInfo.getMiNum());
//		return "movie/update";
//	}
//	
//	@RequestMapping(value = "/movie/delete", method = RequestMethod.POST)
//	public String delete(Model model, @RequestParam long miNum) {
//		model.addAttribute("result", movieService.deleteMovieInfo(miNum));
//		model.addAttribute("miNum", miNum);
//		return "movie/view";
//	}
}
