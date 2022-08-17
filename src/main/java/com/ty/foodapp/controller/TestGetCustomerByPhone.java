package com.ty.foodapp.controller;

import com.ty.foodapp.dao.CustomerDao;
import com.ty.foodapp.dto.Customer;

public class TestGetCustomerByPhone {

	public static void main(String[] args) {

		CustomerDao customerDao = new CustomerDao();
		Customer customer = customerDao.getCustomerByPhone(9550556666l);
		if (customer != null) {
			System.out.println("customer id is " + customer.getId());
			System.out.println("customer name is " + customer.getName());
			System.out.println("customer email is " + customer.getEmail());
			System.out.println("customer phone is " + customer.getPhone());
		}
	}

}
