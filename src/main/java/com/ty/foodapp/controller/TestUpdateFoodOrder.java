package com.ty.foodapp.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.foodapp.dao.FoodOrderDao;
import com.ty.foodapp.dto.FoodOrder;
import com.ty.foodapp.dto.OrderItem;

public class TestUpdateFoodOrder {

	public static void main(String[] args) {

		OrderItem orderItem = new OrderItem();
		orderItem.setCost(99);
		orderItem.setName("sandwitch");
		orderItem.setQty(2);
		List<OrderItem> lo = new ArrayList<OrderItem>();
		lo.add(orderItem);
		FoodOrderDao foodOrderDao = new FoodOrderDao();
		FoodOrder foodOrder = foodOrderDao.getFoodOrderById(1);
		foodOrder.setCost(150);
		foodOrder.setOrderItem(lo);
		foodOrder.setStatus("ordered");
		
		foodOrderDao.updateFoodOrder(foodOrder);

	}

}
