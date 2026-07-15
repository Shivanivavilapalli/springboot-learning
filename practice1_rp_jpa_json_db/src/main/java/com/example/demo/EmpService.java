package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	@Autowired
	private EmpRepo repo;
	public Employee saveEmp(Employee emp) {
		return repo.save(emp);
	}
	public List<Employee> getAll(){
		return repo.findAll();
	}
	public Employee getById(Integer id) {
		return repo.findById(id).orElse(null);
	}
	public Employee updateEmp(Employee emp) {
		return repo.save(emp);
	}
	public String deleteEmp(int id) {
		repo.deleteById(id);
		return "Employee Deleted";
	}
}
