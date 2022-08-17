package com.ty.foodapp.controller;

import java.util.List;

import com.ty.foodapp.dao.FoodOrderDao;
import com.ty.foodapp.dto.FoodOrder;
import com.ty.foodapp.dto.OrderItem;

public class TestGetFoodOrderById {

	public static void main(String[] args) {

		FoodOrderDao foodOrderDao = new FoodOrderDao();
		FoodOrder foodOrder = foodOrderDao.getFoodOrderById(1);

		if (foodOrder != null) {
			System.out.println("foodorder id is " + foodOrder.getId());
			System.out.println("food order cost is " + foodOrder.getCost());
			System.out.println("food order status " + foodOrder.getStatus());
			System.out.println("food order time is " + foodOrder.getOrderDateTime());
			List<OrderItem> lf = foodOrder.getOrderItem();
			if (lf != null) {

				for (OrderItem orderItem : lf) {
					System.out.println("ordered item id is " + orderItem.getId());
					System.out.println("ordered item name is " + orderItem.getName());
					System.out.println("ordered item cost is " + orderItem.getCost());
					System.out.println("ordered item quantity is " + orderItem.getQty());
				}
			}
		}
	}

}
