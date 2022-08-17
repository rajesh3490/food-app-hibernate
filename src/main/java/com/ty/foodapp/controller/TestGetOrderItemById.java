package com.ty.foodapp.controller;

import com.ty.foodapp.dao.FoodOrderDao;
import com.ty.foodapp.dto.OrderItem;

public class TestGetOrderItemById {

	public static void main(String[] args) {

		FoodOrderDao foodOrderDao = new FoodOrderDao();
		OrderItem orderItem = foodOrderDao.getOrderItemById(1);

		if (orderItem != null) {
			System.out.println("" + orderItem.getId());
			System.out.println("" + orderItem.getName());
			System.out.println("" + orderItem.getCost());
			System.out.println("" + orderItem.getQty());
		}
	}

}
