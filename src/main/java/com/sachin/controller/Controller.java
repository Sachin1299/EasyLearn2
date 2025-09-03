package com.sachin.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sachin.Entity.User;
import com.sachin.Entity.UserOperation;
import com.sachin.Entity.UserRepository;
import com.sachin.security.Login;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	Login login;

	@Autowired
	private UserRepository ur;
	
	@Autowired
	private UserOperation uo;
	
	@Autowired
    private PasswordEncoder passwordEncoder;

	@GetMapping("/home")
	public String first() {
		return "Home";
	}

	@GetMapping("loginmessage")
	public @ResponseBody String emailerrormsg(@RequestParam String email) {
		User emaillist = ur.findByEmail(email);
		String errormsg = "";
		System.out.println("login message"+emaillist+" "+email);
		if (emaillist!=null) {
			errormsg = "Accout with this email already exits";
		}

		return errormsg;
	}

	@GetMapping("loginmessage1")
	public @ResponseBody String usernameerrormsg(@RequestParam String username) {
		User usernamelist = ur.findByUsername(username);
		String errormsg = "";
		if (usernamelist!=null) {
			errormsg = "Username already exists";
		}
		return errormsg;
	}

	@GetMapping("/")
	public String second(Model model) {
		model.addAttribute("msg", "");
		return "Home";
	}

	@PostMapping("signup")
	public String signup(@ModelAttribute User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		System.out.println(uo.registerUser(user));
		return "Home";
	}
    
	@GetMapping("logout")
	public String logout()
	{
		Login.setLOGIN(false);
		return "Home";
	}
//	
//	@PostMapping("login")
//	public String login(@RequestParam("email") String Email, @RequestParam("password") String Password, Model model) {
//		System.out.println(Email + " " + Password);
//		List<User> user = uo.findByEmailAndPassword(Email, Password);
//		if (user.isEmpty()) {
//			System.out.println("list is empty");
//			model.addAttribute("msg", "Incorrect Password !!!");
//			return "incorrectPassword";
//		} else {
//			System.out.println("list is not empty");
//			Login.setLOGIN(true);
//			return "Home";
//		}
//	}
	
	@PostMapping("/login")
	public String login(@RequestBody User user, Model model) {
		
		String message = uo.verify(user);
		if(message == "Success") {
			model.addAttribute("isLoggedIn");
			return message;
		}
		else {
			model.addAttribute("isLoggedIn", false);
			return message;
		}
	}
	
	@GetMapping("/about")
	public String about()
	{
		return "about";
	}
	
	@GetMapping("/contact")
	public String contact()
	{
		return "Contact";
	}
}
