package com.jisna.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.jisna.dao.UserDao;
import com.jisna.model.Login;
import com.jisna.model.UserRegister;

public  class UserServiceImpl implements UserService{
	@Autowired
	UserDao userdao;

	public void register(UserRegister user) {
		userdao.register(user);
		
	}
	public UserRegister ValidateUser(Login login) {
		// TODO Auto-generated method stub
		return userdao.validateUser(login);
	}

	
}
