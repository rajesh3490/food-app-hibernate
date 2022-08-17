package com.ty.foodapp.controller;

import com.ty.foodapp.dao.FoodOrderDao;
import com.ty.foodapp.dto.OrderItem;

public class TestUpdateOrderItem {

	public static void main(String[] args) {

		FoodOrderDao foodOrderDao = new FoodOrderDao();
		OrderItem orderItem = foodOrderDao.getOrderItemById(1);
		if (orderItem != null) {
			orderItem.setCost(77);
			orderItem.setName("pizza");
			orderItem.setQty(2);
			foodOrderDao.updateOrderItem(orderItem);
		}
	}

}
