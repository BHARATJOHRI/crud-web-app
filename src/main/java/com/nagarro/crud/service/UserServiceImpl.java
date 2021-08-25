package com.nagarro.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.crud.model.User;
import com.nagarro.crud.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public User login(String username, String password) {
		User user = userRepository.findByUsernameAndPassword(username, password);
		return user;
	}
}
