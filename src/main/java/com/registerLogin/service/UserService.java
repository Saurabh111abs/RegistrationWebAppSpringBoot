package com.registerLogin.service;

import com.registerLogin.entity.User;

public interface UserService {
	
	public User saveUser(User user);
	public void removeSessionMessage();
}
