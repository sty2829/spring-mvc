package com.test.sp.dao;

import java.util.List;

import com.test.sp.entity.FoodInfo;

public interface FoodDAO {

	List<FoodInfo> getFoodInfoList();
	
	int insertFoodInfo(FoodInfo food);
}
