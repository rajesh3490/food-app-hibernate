package com.ty.foodapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.foodapp.dto.Customer;

public class CustomerDao {

	public Customer validateCustomer(long phone) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "select c from Customer c where phone=?1";
		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, phone);
		List<Customer> customerList = query.getResultList();
		if (customerList != null) {
			return customerList.get(0);
		}
		return null;
	}

	public void saveCustomer(Customer customer) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();
	}

	public void deleteCustomer(long phone) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		String jpql = "select c from Customer c where phone=?1";
		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, phone);
		List<Customer> customerList = query.getResultList();
		entityTransaction.begin();
		if (!(customerList.size() <= 0)) {
			entityManager.remove(customerList.get(0));
		}
		entityTransaction.commit();
	}

	public void updateCustomer(Customer customer) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.merge(customer);
		entityTransaction.commit();
	}

	public List<Customer> GetAllCustomers() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String jpql = "select c from Customer c";
		Query query = entityManager.createQuery(jpql);
		List<Customer> customerList = query.getResultList();
		return customerList;
	}

	public Customer getCustomerByPhone(long phone) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String jpql = "select c from Customer c where phone=?1";
		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, phone);
		List<Customer> customerList = query.getResultList();
		if (customerList != null) {
			return customerList.get(0);
		}
		return null;
	}

}
