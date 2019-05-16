package com.nt.service;

import com.nt.model.Login;
import com.nt.model.User;

public interface UserService {
	 void register(User user);
	  User validateUser(Login login);
}
