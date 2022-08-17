package com.ty.foodapp.controller;

import com.ty.foodapp.dao.CustomerDao;
import com.ty.foodapp.dto.Customer;

public class TestUpdateCustomer {

	public static void main(String[] args) {

		CustomerDao customerDao = new CustomerDao();
		Customer customer = customerDao.getCustomerByPhone(9550556666l);
		customer.setEmail("rajesh@gmail.com");
		customer.setName("rajesh");
		customer.setPhone(9550556669l);
		customerDao.updateCustomer(customer);
	}

}
