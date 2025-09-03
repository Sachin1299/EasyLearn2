package com.sachin.Entity;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	public User findByUsername(String username);
	//public List<User> findByEmail(String email);
	public User findByEmail(String email);
	public List<User> findByEmailAndPassword(String email,String password);
}
