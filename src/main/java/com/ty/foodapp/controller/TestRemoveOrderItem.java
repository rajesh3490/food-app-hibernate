package com.ty.foodapp.controller;

import com.ty.foodapp.dao.FoodOrderDao;
import com.ty.foodapp.dto.FoodOrder;

public class TestRemoveOrderItem {

	public static void main(String[] args) {

		FoodOrderDao foodOrderDao = new FoodOrderDao();
		FoodOrder foodOrder = foodOrderDao.getFoodOrderById(1);
		foodOrderDao.cancelFoodOrder(foodOrder);
	}

}
