package com.ty.foodapp.dao;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.foodapp.dto.FoodMenu;
import com.ty.foodapp.dto.FoodOrder;
import com.ty.foodapp.dto.OrderItem;

public class FoodOrderDao {

	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();
	private static EntityTransaction entityTransaction = entityManager.getTransaction();

	public FoodOrder getFoodOrderById(int id) {
		FoodOrder foodOrder = entityManager.find(FoodOrder.class, id);
		return foodOrder;
	}

	public boolean cancelFoodOrder(FoodOrder foodOrder) {
		if (foodOrder != null) {
			entityTransaction.begin();
			entityManager.remove(foodOrder);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public void createFoodOder(List<OrderItem> items) {
		FoodOrder foodOrder = new FoodOrder();
		Double totalItemsPrice = items.stream().collect(Collectors.summingDouble(item -> item.getCost()));
		foodOrder.setStatus("ordered");
		foodOrder.setCost(totalItemsPrice);
		foodOrder.setOrderItem(items);
		entityTransaction.begin();
		entityManager.persist(foodOrder);

		entityTransaction.commit();

	}

	public void updateFoodOrder(FoodOrder foodOrder) {
		entityTransaction.begin();
		entityManager.merge(foodOrder);
		entityTransaction.commit();
	}

	public OrderItem addOrderItem(FoodMenu foodMenu, int quantity) {
		OrderItem orderItem = new OrderItem();

		orderItem.setName(foodMenu.getName());
		orderItem.setCost(foodMenu.getCost());
		orderItem.setQty(quantity);
		entityTransaction.begin();
		entityManager.persist(orderItem);
		entityTransaction.commit();
		return orderItem;
	}

	public OrderItem getOrderItemById(int id) {
		OrderItem orderItem = entityManager.find(OrderItem.class, id);
		return orderItem;
	}

	public boolean removeOrderItem(OrderItem item) {
		OrderItem orderItem = getOrderItemById(item.getId());
		if (orderItem != null) {
			entityTransaction.begin();
			entityManager.remove(orderItem);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public void updateOrderItem(OrderItem orderItem) {
		OrderItem orderItem2 = getOrderItemById(orderItem.getId());
		if (orderItem2 != null) {
			orderItem2.setQty(orderItem.getQty());
			orderItem2.setCost(orderItem.getCost());
			orderItem2.setName(orderItem.getName());
			entityTransaction.begin();
			entityManager.merge(orderItem2);
			entityTransaction.commit();
		}
	}

}