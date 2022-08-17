package com.ty.foodapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.foodapp.dto.FoodMenu;

public class FoodMenuDao {

	public void saveFoodMenu(FoodMenu foodMenu) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(foodMenu);
		entityTransaction.commit();
	}

	public void deleteFoodMenu(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		FoodMenu foodMenu = entityManager.find(FoodMenu.class, id);
		entityTransaction.begin();
		if (foodMenu != null) {
			entityManager.remove(foodMenu);
		}
		entityTransaction.commit();
	}

	public void updateFoodMenu(FoodMenu foodMenu) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(foodMenu);
		entityTransaction.commit();
	}

	public List<FoodMenu> GetAllfoodMenu() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String jpql = "select f from FoodMenu f";
		Query query = entityManager.createQuery(jpql);
		List<FoodMenu> foodMenuList = query.getResultList();
		return foodMenuList;
	}

	public FoodMenu getFoodMenuById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String jpql = "select f from FoodMenu f where id=?1";
		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, id);
		List<FoodMenu> foodMenuList = query.getResultList();
		if (foodMenuList != null) {
			return foodMenuList.get(0);
		}
		return null;
	}

}
