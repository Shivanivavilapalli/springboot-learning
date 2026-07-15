package com.example.demo;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootJdbcTemplatedbApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext con = SpringApplication.run(SpringBootJdbcTemplatedbApplication.class, args);
	Dao da = (Dao)con.getBean(Dao.class);
	Scanner sc = new Scanner(System.in);
	Product p = new Product(sc.nextInt(),sc.next(),sc.nextDouble());
	System.out.println(da.savedata(p));
	List<Product> d = da.getData();
	for(Product p2:d) {
		System.out.println(p2.getPid()+" "+p2.getPname()+" "+p2.getPprice());
	}
	}

}
