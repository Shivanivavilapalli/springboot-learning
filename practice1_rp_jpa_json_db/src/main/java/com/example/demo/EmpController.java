package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restapi")
public class EmpController {
	@Autowired
	public EmpService ser;
	@PostMapping("/save1")
	public Employee saveData(@RequestBody Employee emp) {
		
		return ser.saveEmp(emp);
	}
	@GetMapping("/getall")
	public List<Employee> getAllData(){
		return ser.getAll();
	}
	@GetMapping("/get1/{id}")
    public Employee getById(@PathVariable Integer id) {
        return ser.getById(id);
    }

    @PutMapping("/update")
    public Employee updateData(@RequestBody Employee emp) {
        return ser.updateEmp(emp);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteData(@PathVariable int id) {
        return ser.deleteEmp(id);
    }
    
}
