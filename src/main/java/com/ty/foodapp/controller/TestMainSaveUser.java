package com.ty.foodapp.controller;

import com.ty.foodapp.dao.UserDao;
import com.ty.foodapp.dto.User;
import com.ty.foodapp.helper.Encrypt;

public class TestMainSaveUser {

	public static void main(String[] args) {

		User user = new User();
		user.setName("ramu");
		String pass = "ramu3490";
		String password = Encrypt.encrypt(pass);
		user.setPassword(password);
		String email1 = "ramu@gmail.com";
		String email = Encrypt.encrypt(email1);
		user.setEmail(email);
		user.setPhone(9550556999l);
		user.setRole("waiter");

		UserDao userDao = new UserDao();
		userDao.saveUser(user);

	}

}
