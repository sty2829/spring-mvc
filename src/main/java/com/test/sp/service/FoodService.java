package com.test.sp.service;

import java.util.List;

import com.test.sp.entity.FoodInfo;

public interface FoodService {

	List<FoodInfo> getFoodInfoList();
	
	int insertFoodInfo(FoodInfo food);
	
	FoodInfo getFoodInfo(long fiNum);
	
	int updateFoodInfo(FoodInfo food);
	
	int deleteFoodInfo(long fiNum);
}
