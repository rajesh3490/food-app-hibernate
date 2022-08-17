package com.ty.foodapp.controller;

import com.ty.foodapp.dao.FoodMenuDao;
import com.ty.foodapp.dto.FoodMenu;

public class TestGetFoodMenuById {

	public static void main(String[] args) {

		FoodMenuDao foodMenuDao = new FoodMenuDao();
		FoodMenu foodMenu = foodMenuDao.getFoodMenuById(1);
		if (foodMenu != null) {
			System.out.println("food item name is " + foodMenu.getName());
			System.out.println("food item id is " + foodMenu.getId());
			System.out.println("food item cost is " + foodMenu.getCost());
			System.out.println("food item description is " + foodMenu.getDescription());
		}
	}

}
