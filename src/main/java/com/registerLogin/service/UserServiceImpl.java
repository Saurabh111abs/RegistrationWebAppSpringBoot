package com.registerLogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.registerLogin.entity.User;
import com.registerLogin.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
    @Autowired
	private UserRepo userRepo;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public User saveUser(User user) {
		String password = bCryptPasswordEncoder.encode(user.getPassword());
		user.setPassword(password);
		user.setRole("Role User");
		User user1 = userRepo.save(user);
		return user1;
	}

	@Override
	public void removeSessionMessage() {
( (ServletRequestAttributes) (RequestContextHolder.getRequestAttributes()) ).getRequest().getSession();
		
	}

}
