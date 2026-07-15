package com.example.demo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Mcomp implements Serializable{
	@Value("2")
	private int Mid;
	@Value("moto")
	private String Mname;
	@Value("hyd")
	private String Mloc;
	@Autowired
	private Product p;
	public Mcomp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mcomp(int mid, String mname, String mloc, Product p) {
		super();
		Mid = mid;
		Mname = mname;
		Mloc = mloc;
		this.p = p;
	}
	public int getMid() {
		return Mid;
	}
	public void setMid(int mid) {
		Mid = mid;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public String getMloc() {
		return Mloc;
	}
	public void setMloc(String mloc) {
		Mloc = mloc;
	}
	public Product getP() {
		return p;
	}
	public void setP(Product p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "Mcomp [Mid=" + Mid + ", Mname=" + Mname + ", Mloc=" + Mloc + ", p=" + p.toString() + "]";
	}
	
}
