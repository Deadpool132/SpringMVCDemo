package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("login")
	public String loginPage(@RequestParam("username") String username, @RequestParam("password") String password,
			Model mv) {
		String msg;
		if (password.equals("admin")) {
			msg = "Hello " + username + ". How are you doin???";
			mv.addAttribute("message", msg);
			return "calculator";
		} else {
			msg = "Please enter correct password";
			mv.addAttribute("message", msg);
			return "error";
		}
	}
}
