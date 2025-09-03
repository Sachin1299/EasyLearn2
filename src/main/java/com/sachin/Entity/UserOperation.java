package com.sachin.Entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;



@Service
public class UserOperation {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	AuthenticationManager authmanager;
	
	
	public User registerUser(User user) {
		return userRepo.save(user);
	}
	
    public List<User> getUsers(){
    	return (List<User>) userRepo.findAll();
    }
    
    public String verify(User user) {
    	Authentication authentication = authmanager.authenticate(new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword()));
    	if(authentication.isAuthenticated()) {
    		SecurityContextHolder.getContext().setAuthentication(authentication);
            return "Success"; // or return a token if using JWT
    	}
		return "Fail";
    	
    }
}
