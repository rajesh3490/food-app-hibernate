package com.ty.foodapp.controller;

import com.ty.foodapp.dao.FoodMenuDao;
import com.ty.foodapp.dto.FoodMenu;

public class TestSaveFoodMenu {

	public static void main(String[] args) {

		FoodMenuDao foodMenuDao = new FoodMenuDao();
		FoodMenu foodMenu = new FoodMenu();
		foodMenu.setName("burger");
		foodMenu.setDescription("no cheese");
		foodMenu.setCost(100);
		foodMenuDao.saveFoodMenu(foodMenu);
	}

}
