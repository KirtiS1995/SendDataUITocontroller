package com.BikkadIt.SendingDataUItoController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AdditionController {

	//@GetMapping("/printValue/{a}")
	//we can give path param in between URL
	@GetMapping("/printValue/{a}/additionController")

	public String printValue(@PathVariable int a ,Model model)
	{
		String msg="The value of a = "+a;
		//System.out.println(msg);
		System.out.println(a);

		model.addAttribute("MSG", msg);
		
		return "print";
		
	}
	
	@GetMapping("/addition/{a}/{b}")
	public String addition(@PathVariable int a,@PathVariable int b,Model model)
	{
		int c=a+b;
		String msg="Addition of a and b = "+c;
		System.out.println(msg);
		model.addAttribute("ADDITION", msg);
		
		return "addition";
		
	}
	
}


//http://localhost:9090/printValue/20
//http://localhost:9090/printValue/20/additionController   in between paramter
//http://localhost:9090/addition/20/50
	
