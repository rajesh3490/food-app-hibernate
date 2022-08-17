package com.ty.foodapp.controller;

import java.util.List;

import com.ty.foodapp.dao.FoodMenuDao;
import com.ty.foodapp.dto.FoodMenu;

public class TestGetAllFoodMenu {

	public static void main(String[] args) {

		FoodMenuDao foodMenuDao = new FoodMenuDao();
		List<FoodMenu> lf = foodMenuDao.GetAllfoodMenu();

		if (lf != null) {
			for (FoodMenu foodMenu : lf) {
				System.out.println("food item name is " + foodMenu.getName());
				System.out.println("food item id is " + foodMenu.getId());
				System.out.println("food item cost is " + foodMenu.getCost());
				System.out.println("food item description is " + foodMenu.getDescription());
			}
		}
	}

}
