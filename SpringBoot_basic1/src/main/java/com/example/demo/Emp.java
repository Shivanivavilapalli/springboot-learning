package com.example.demo;

import java.io.Serializable;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix = "list")
public class Emp implements Serializable{
//	@Value("${list.eid}")
	private List<Integer> eid;
//	@Value("${list.ename}")
	private List<String> ename;
//	@Value("${list.esalary}")
	private List<Double> esalary;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(List<Integer> eid, List<String> ename, List<Double> esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	public List<Integer> getEid() {
		return eid;
	}
	public void setEid(List<Integer> eid) {
		this.eid = eid;
	}
	public List<String> getEname() {
		return ename;
	}
	public void setEname(List<String> ename) {
		this.ename = ename;
	}
	public List<Double> getEsalary() {
		return esalary;
	}
	public void setEsalary(List<Double> esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	
}
