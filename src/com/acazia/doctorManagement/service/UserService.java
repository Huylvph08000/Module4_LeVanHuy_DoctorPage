package com.acazia.doctorManagement.service;

import com.acazia.doctorManagement.model.User;

public class UserService {
	public boolean checkLogin(User user) {
		if ("admin".equals(user.getUsername()) && "123456".equals(user.getPassword())) {
			return true;
		} else {
			return false;
		}
	}
}
