package com.ty.foodapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.foodapp.dto.User;
import com.ty.foodapp.helper.Encrypt;

public class UserDao {

	public User validateUser(String email, String password) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "select u from User u where email=?1 and password=?2";
		String pass = Encrypt.encrypt(password);
		String mail = Encrypt.encrypt(email);
		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, mail);
		query.setParameter(2, pass);
		List<User> user1 = query.getResultList();
		if (!(user1.size() <= 0)) {
			return user1.get(0);
		}
		return null;
	}

	public void saveUser(User user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
	}

	public void deleteUser(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user = entityManager.find(User.class, 1);
		entityTransaction.begin();
		entityManager.remove(user);
		entityTransaction.commit();
	}

	public void updateUser(User user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();
	}

	public List<User> getAllUsers() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String jpql = "select u from User u";
		Query query = entityManager.createQuery(jpql);
		List<User> userList = query.getResultList();
		return userList;
	}

	public User getUserById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String jpql = "select u from User u where id=?1";
		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, id);
		List<User> userList = query.getResultList();
		if (userList != null) {
			return userList.get(0);
		}
		return null;
	}

}
