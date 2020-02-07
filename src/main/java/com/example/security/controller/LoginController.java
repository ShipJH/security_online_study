package com.example.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@GetMapping(value = "/test")
	public @ResponseBody String test() {
		
		return "hello";
	}
	
	@GetMapping(value = "/test2")
	public String test2(Model model) {
		
		model.addAttribute("key", "value~");
		
		return "testview";
	}
}
