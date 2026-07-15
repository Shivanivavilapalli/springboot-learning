package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employes")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer eid;
	@Column
private String ename;
	@Column
private double esalary;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(Integer eid, String ename, double esalary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esalary = esalary;
}
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getEsalary() {
	return esalary;
}
public void setEsalary(double esalary) {
	this.esalary = esalary;
}

}
