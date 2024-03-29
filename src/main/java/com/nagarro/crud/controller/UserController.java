package com.nagarro.crud.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.crud.model.User;
import com.nagarro.crud.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("user", new User());
		return mav;
	}

	@PostMapping("/login")
	public String login(@ModelAttribute("user") User user) {
		User oauthUser = userService.login(user.getUsername(), user.getPassword());
		if(Objects.nonNull(oauthUser)) {
			return "redirect:/";
		}
		else {
			return "redirect:/login";
		}
	}

}
