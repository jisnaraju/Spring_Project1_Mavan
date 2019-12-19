package com.jisna.service;

import com.jisna.model.UserRegister;
import com.jisna.model.Login;

public interface UserService {
 void register(UserRegister user);
UserRegister ValidateUser(Login login);
 
 
}
