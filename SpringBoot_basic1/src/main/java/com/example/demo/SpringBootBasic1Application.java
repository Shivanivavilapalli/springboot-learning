package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootBasic1Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext con = SpringApplication.run(SpringBootBasic1Application.class, args);
//	Mcomp m = (Mcomp)con.getBean(Mcomp.class);
//	System.out.println(m);
	Emp e = (Emp)con.getBean(Emp.class);
	List<Integer> x = e.getEid();
	for(int y:x)
			System.out.println(y);
	List<String> n = e.getEname();
	for(String m:n)
			System.out.println(m);
	List<Double> s = e.getEsalary();
	for(double t:s)
			System.out.println(t);
	
	}

}
