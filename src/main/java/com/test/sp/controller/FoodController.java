package com.test.sp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.sp.entity.FoodInfo;
import com.test.sp.service.FoodService;

@Controller
public class FoodController {

	@Autowired
	private FoodService foodService;
	
	@RequestMapping(value = "/foods", method = RequestMethod.GET)
	public String foodList(Model model) {
		model.addAttribute("foodList", foodService.getFoodInfoList());
		return "food/list";
	}
	
	@RequestMapping(value = "/food/view", method = RequestMethod.GET)
	public String foodView(Model model, @RequestParam long fiNum) {
		model.addAttribute("foodInfo", foodService.getFoodInfo(fiNum));
		return "food/view";
	}
	
	
	@RequestMapping(value = "/food/insert", method = RequestMethod.GET)
	public String goInsert() {
		return "food/insert";
	}
	
	@RequestMapping(value = "/food/insert", method = RequestMethod.POST)
	public String insert(FoodInfo food) {
		int cnt = foodService.insertFoodInfo(food);
		return "food/insert";
	}
	
	@RequestMapping(value = "/food/update", method = RequestMethod.GET)
	public String goUpdate(Model model, @RequestParam long fiNum) {
		model.addAttribute("foodInfo", foodService.getFoodInfo(fiNum));
		return "food/update";
	}
	
	@RequestMapping(value = "/food/update", method = RequestMethod.POST)
	public String update(FoodInfo food) {
		int cnt = foodService.updateFoodInfo(food);
		return "food/update";
	}
	
	@RequestMapping(value = "/food/delete", method = RequestMethod.POST)
	public String delete(Model model, @RequestParam long fiNum) {
		model.addAttribute("result", foodService.deleteFoodInfo(fiNum));
		return "food/view";
	}
	
	
}
