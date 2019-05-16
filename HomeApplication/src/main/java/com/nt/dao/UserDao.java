package com.nt.dao;

import com.nt.model.Login;
import com.nt.model.User;

public interface UserDao {
	 void register(User user);
	  User validateUser(Login login);
}
