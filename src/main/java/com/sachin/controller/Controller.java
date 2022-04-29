package com.sachin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sachin.Entity.User;
import com.sachin.Entity.UserOperation;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	private UserOperation uo;

	@GetMapping("/home")
	public String first() {
		return "Home";
	}

	@GetMapping("loginmessage")
	public @ResponseBody String emailerrormsg(@RequestParam("email") String email) {
		List<User> emaillist = uo.findByEmail(email);
		String errormsg = "";
		if (!emaillist.isEmpty()) {
			errormsg = "Accout with this email already exits";
		}

		return errormsg;
	}

	@GetMapping("loginmessage1")
	public @ResponseBody String usernameerrormsg(@RequestParam("username") String username) {
		List<User> usernamelist = uo.findByUsername(username);
		String errormsg = "";
		if (!usernamelist.isEmpty()) {
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
	public String signup(@ModelAttribute("user") User user) {

		System.out.println(uo.save(user));
		return "Home";
	}

	@PostMapping("login")
	public String login(@RequestParam("email") String Email, @RequestParam("password") String Password, Model model) {
		System.out.println(Email + " " + Password);
		List<User> user = uo.findByEmailAndPassword(Email, Password);
		if (user.isEmpty()) {
			System.out.println("list is empty");
			model.addAttribute("msg", "incorrect password");
			return "Home";
		} else {
			System.out.println("list is not empty");
			return "C/An Introduction to C/TheFormOfACProgram";
		}
	}
}
