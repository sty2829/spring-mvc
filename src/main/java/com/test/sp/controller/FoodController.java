package com.test.sp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	@RequestMapping(value = "/food/insert", method = RequestMethod.GET)
	public String goInsert() {
		return "food/insert";
	}
	
	@RequestMapping(value = "/food/insert", method = RequestMethod.POST)
	public String insert(FoodInfo food) {
		int cnt = foodService.insertFoodInfo(food);
		System.out.println(cnt);
		return "food/insert";
	}
	
}
