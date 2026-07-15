package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JdbcController {
	@Autowired
	private JdbcTemplate temp;
	@RequestMapping("/getForm")
	public String getForm() {
		return "ProductData";
	}
	@PostMapping("/send")
	@ResponseBody
	public String saveData(@RequestParam int pid,@RequestParam String pname,@RequestParam double price) {
		String qry = "insert into product values(?,?,?)";
		temp.update(qry,pid,pname,price);
		
		return "Record Stored";
	}
	
}
