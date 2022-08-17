package com.ty.foodapp.controller;

import com.ty.foodapp.dao.UserDao;
import com.ty.foodapp.dto.User;
import com.ty.foodapp.helper.Decrypt;

public class TestValidateUser {

	public static void main(String[] args) {

		UserDao userDao = new UserDao();
		User user = userDao.validateUser("ramu@gmail.com", "ramu3490");

		if (user != null) {
			System.out.println("user name is " + user.getName());
			System.out.println("user id is " + user.getId());
			String mail = Decrypt.decrypt(user.getEmail());
			System.out.println("user email is " + mail);
			System.out.println("user phone is " + user.getPhone());
			String password = Decrypt.decrypt(user.getPassword());
			System.out.println("user password is " + password);
			System.out.println("user role is " + user.getRole());
		} else {
			System.out.println("no user found");
		}
	}

}
