package com.jisna.dao;

import com.jisna.model.Login;
import com.jisna.model.UserRegister;
public interface UserDao {
	 void register(UserRegister user);
	 UserRegister  validateUser(Login login);
}
