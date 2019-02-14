package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.util.LoveCalculator;

@RestController
public class MyController {
	
	
	@Autowired
	private LoveCalculator loveCalculator;

	@GetMapping("/")
	public String index() {

		return "index";
	}
	
	
	@GetMapping("/lovecal/{txtname}/{tstname}")
	public String home(@PathVariable("txtname")String txtname, @PathVariable("tstname")String tstname,ModelMap map) {
		
		Integer percentage=loveCalculator.getLovePercentageResult(txtname, tstname);
		map.addAttribute("txtname", txtname);
		map.addAttribute("tstname", tstname);
		map.addAttribute("percentage", percentage);		
		
		if(percentage>60) {
			return percentage+"";
		}else {
		int val=percentage+40;
			return val+"";
		}
		
		
		//return percentage+"";
		//return "home";
	}
}
