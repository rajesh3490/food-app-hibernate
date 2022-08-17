package com.ty.foodapp.controller;

import com.ty.foodapp.dao.FoodMenuDao;
import com.ty.foodapp.dto.FoodMenu;

public class TestUpdateFoodMenu {

	public static void main(String[] args) {

		FoodMenuDao foodMenuDao = new FoodMenuDao();
		FoodMenu foodMenu = foodMenuDao.getFoodMenuById(1);
		foodMenu.setCost(150);
		foodMenu.setName("Burger");
		foodMenu.setDescription("no cheese");
		foodMenuDao.updateFoodMenu(foodMenu);
	}

}
