package com.registerLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registerLogin.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
 
	public User findByEmail(String email);
}
