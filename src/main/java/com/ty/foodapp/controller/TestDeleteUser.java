package com.ty.foodapp.controller;

import com.ty.foodapp.dao.UserDao;

public class TestDeleteUser {

	public static void main(String[] args) {

		UserDao userDao = new UserDao();
		userDao.deleteUser(1);
	}

}
