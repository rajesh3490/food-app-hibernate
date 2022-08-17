package com.ty.foodapp.controller;

import com.ty.foodapp.dao.UserDao;
import com.ty.foodapp.dto.User;
import com.ty.foodapp.helper.Encrypt;

public class TestUpdateUser {

	public static void main(String[] args) {

		UserDao userDao = new UserDao();
		User user = userDao.getUserById(1);
		user.setPhone(9550556900l);
		String pass = "ramu3490";
		String password = Encrypt.encrypt(pass);
		user.setPassword(password);
		String email1 = "ramu@gmail.com";
		String email = Encrypt.encrypt(email1);
		user.setEmail(email);
		user.setRole("waiter");
		user.setName("ramu");
		userDao.updateUser(user);
	}

}
