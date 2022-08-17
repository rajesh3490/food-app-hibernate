package com.ty.foodapp.controller;

import com.ty.foodapp.dao.CustomerDao;

public class TestDeleteCustomer {

	public static void main(String[] args) {

		CustomerDao customerDao = new CustomerDao();
		customerDao.deleteCustomer(9550556669l);
	}

}
