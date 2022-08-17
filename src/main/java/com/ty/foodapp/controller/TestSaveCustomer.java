package com.ty.foodapp.controller;

import com.ty.foodapp.dao.CustomerDao;
import com.ty.foodapp.dto.Customer;

public class TestSaveCustomer {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setName("rajesh");
		customer.setEmail("rajesh@gmail.com");
		customer.setPhone(9550556666l);

		CustomerDao customerDao = new CustomerDao();
		customerDao.saveCustomer(customer);
	}

}
