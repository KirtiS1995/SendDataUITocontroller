package com.BikkadIt.SendingDataUItoController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {

	@GetMapping("/getCourseData")
	public ModelAndView getcourseDetails(@RequestParam String cname,@RequestParam String tname)
	{
		String msg=cname+ " New Batch starting from 1st march 2013 by "+tname;
		ModelAndView mav=new ModelAndView();
		mav.addObject("COURSE", msg);
		mav.setViewName("course");		//jsp file
		
		return mav;
		
	}
	
}
//http://localhost:9090/getCourseData?cname=JavaDevelopment&tname=Santosh