package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restAPI")
public class ProductController {
	@Autowired
	private ProductService service;
	@PostMapping("/save")
public Product saveData(@RequestBody Product prod)
{
	return service.saveProduct(prod);
	
}
}
