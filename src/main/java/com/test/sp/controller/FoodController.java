package com.test.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.sp.entity.FoodInfo;
import com.test.sp.service.FoodService;

@Controller
public class FoodController {

	@Autowired
	private FoodService foodService;
	
	@RequestMapping(value = "/foods", method = RequestMethod.GET)
	public @ResponseBody List<FoodInfo> getFoodList(){
		return foodService.getFoodInfoList();
	}
}
