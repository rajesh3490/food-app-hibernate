package com.ty.foodapp.controller;

import com.ty.foodapp.dao.FoodOrderDao;
import com.ty.foodapp.dto.FoodMenu;

public class TestAddOrderItem {

	public static void main(String[] args) {

		FoodMenu foodMenu = new FoodMenu();
		foodMenu.setName("burger");
		foodMenu.setCost(100);
		foodMenu.setDescription("no cheese");

		FoodOrderDao foodOrderDao = new FoodOrderDao();
		foodOrderDao.addOrderItem(foodMenu, 2);
	}

}
