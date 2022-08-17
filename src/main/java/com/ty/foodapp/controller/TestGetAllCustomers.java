package com.ty.foodapp.controller;

import java.util.List;

import com.ty.foodapp.dao.CustomerDao;
import com.ty.foodapp.dto.Customer;

public class TestGetAllCustomers {

	public static void main(String[] args) {

		CustomerDao customerDao = new CustomerDao();
		List<Customer> lc = customerDao.GetAllCustomers();
		if (lc != null) {
			for (Customer customer : lc) {
				System.out.println("customer id is " + customer.getId());
				System.out.println("customer name is " + customer.getName());
				System.out.println("customer email is " + customer.getEmail());
				System.out.println("customer phone is " + customer.getPhone());
			}
		}
	}

}
