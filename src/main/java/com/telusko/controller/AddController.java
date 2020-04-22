package com.telusko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.telusko.service.Service;

@Controller
public class AddController {
	
	@Autowired
	Service service;
	@RequestMapping("add")
	public String add(@RequestParam("t1")int num1,@RequestParam("t2")int num2,Model m) {
		int res = service.add(num1, num2);
		String msg = "The Result is " +res;
		m.addAttribute("result", msg);
		return "result";
	}
}