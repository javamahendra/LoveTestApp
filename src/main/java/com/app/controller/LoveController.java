package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.util.LoveCalculator;

@Controller
public class LoveController {

	@Autowired
	private LoveCalculator loveCalculator;

	@GetMapping("/")
	public String index() {

		return "home";
	}
	
	@GetMapping("/home")
	public String home() {

		return "home";
	}

	@GetMapping("/lovecal")
	public String love(@RequestParam("txtuname") String txtuname, @RequestParam("txtpname") String txtpname,
			ModelMap map) {

		Integer percentage = loveCalculator.getLovePercentageResult(txtuname, txtpname);
		map.addAttribute("txtuname", txtuname);
		map.addAttribute("txtpname", txtpname);

		if (percentage > 60) {
			map.addAttribute("percentage", percentage);
		} else {
			int val = percentage + 40;
			map.addAttribute("percentage", val);
		}

		// return percentage+"";
		return "love";
	}
}
