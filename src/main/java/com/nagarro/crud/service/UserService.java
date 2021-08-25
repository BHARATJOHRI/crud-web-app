package com.nagarro.crud.service;

import com.nagarro.crud.model.User;

public interface UserService {
	User login(String username,String password);
}
