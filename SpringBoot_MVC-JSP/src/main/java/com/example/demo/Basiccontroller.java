package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Basiccontroller {
	@RequestMapping("/getData")
	public String getFormData() {
		return "empdetails";
	}
	@PostMapping("/data")
	public String showPage(@ModelAttribute Empl emp,Model mod) {
		mod.addAttribute("empdetails",emp);
		return "sample";
	}
	@RequestMapping("/test")
	public String test() {
	    System.out.println("Controller reached");
	    return "empdetails";
	}
}
