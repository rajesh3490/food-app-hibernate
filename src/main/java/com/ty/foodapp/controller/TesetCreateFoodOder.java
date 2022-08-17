package com.ty.foodapp.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.foodapp.dao.FoodOrderDao;
import com.ty.foodapp.dto.OrderItem;

public class TesetCreateFoodOder {

	public static void main(String[] args) {

		List<OrderItem> lo = new ArrayList<OrderItem>();
		OrderItem orderItem1 = new OrderItem();
		orderItem1.setName("pizza");
		orderItem1.setCost(100);
		orderItem1.setQty(4);
		lo.add(orderItem1);

		OrderItem orderItem2 = new OrderItem();
		orderItem1.setName("pepsi");
		orderItem1.setCost(50);
		orderItem1.setQty(1);
		lo.add(orderItem2);

		FoodOrderDao foodOrderDao = new FoodOrderDao();
		foodOrderDao.createFoodOder(lo);
	}

}
