package com.sachin.Entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserOperation extends CrudRepository<User, Integer>{

	public List<User> findByUsername(String username);
	public List<User> findByEmail(String email);
	public List<User> findByEmailAndPassword(String email,String password);
}
