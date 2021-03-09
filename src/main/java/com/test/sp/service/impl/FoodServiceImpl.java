package com.test.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sp.dao.FoodDAO;
import com.test.sp.entity.FoodInfo;
import com.test.sp.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService{

	@Autowired
	private FoodDAO foodDAO;
	
	@Override
	public List<FoodInfo> getFoodInfoList() {
		return foodDAO.getFoodInfoList();
	}

	@Override
	public int insertFoodInfo(FoodInfo food) {
		return foodDAO.insertFoodInfo(food);
	}

	@Override
	public FoodInfo getFoodInfo(long fiNum) {
		return foodDAO.getFoodInfo(fiNum);
	}

	@Override
	public int updateFoodInfo(FoodInfo food) {
		return foodDAO.updateFoodInfo(food);
	}

	@Override
	public int deleteFoodInfo(long fiNum) {
		return foodDAO.deleteFoodInfo(fiNum);
	}

	
}
