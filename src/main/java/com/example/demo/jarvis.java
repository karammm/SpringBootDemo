package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//hey spring framework this is a class for which i need an object
//Spring framework works on singleton design pattern
//So in singleton you get only one instance
@Component
//@Scope(value="prototype")//by creating prototype it means it will not create an instance by default
//the only moment you ask for getBean at that point it will create an object for you
public class jarvis {
	private int jid;
	public jarvis() {
		super();
		System.out.println("***********Object Created**********");
	}
	private String jname;
	private String tech;
	@Autowired//Now it will try to search for the object in the spring container
	@Qualifier("lap1")
	private Laptop laptop;
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public void show() {
		System.out.println("Hey component");
		laptop.compile();
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
}
