package com.BikkadIt.SendingDataUItoController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	
	
	//RequestParam  -- read value from UI
	@GetMapping("/welcomeMsg")
	public String welcomeMsg(@RequestParam String name,Model model)		//@Data from UI to controller
	{
		String msg="HII "+name+" Welcome to bikkadIT";
		System.out.println(msg);
		model.addAttribute("MSG", msg);
		
		return "welcome";			//jsp file
		
	}
	
}

//run in browser as = http://localhost:9090/welcomeMsg?name=shlok