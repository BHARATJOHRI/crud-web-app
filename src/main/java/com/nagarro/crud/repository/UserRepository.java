package com.nagarro.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.crud.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	User findByUsernameAndPassword(String username,String password);
}
