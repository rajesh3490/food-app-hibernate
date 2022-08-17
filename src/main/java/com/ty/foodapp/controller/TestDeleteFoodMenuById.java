package com.ty.foodapp.controller;

import com.ty.foodapp.dao.FoodMenuDao;

public class TestDeleteFoodMenuById {

	public static void main(String[] args) {

		FoodMenuDao foodMenuDao = new FoodMenuDao();
		foodMenuDao.deleteFoodMenu(1);
	}

}
