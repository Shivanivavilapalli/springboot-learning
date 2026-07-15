package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private ProductRepo repo;
	
	public Product saveProduct(Product prod)
	{
		return repo.save(prod);
		
	}

}
