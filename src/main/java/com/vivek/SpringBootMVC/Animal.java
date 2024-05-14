package com.vivek.SpringBootMVC;

public class Animal {
	String aname;
	int aage;
	
	public Animal(String aname, int aage) {
		this.aname = aname;
		this.aage = aage;
	}
	
	public String getAname() {
		return aname;
	}
	
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getAage() {
		return aage;
	}
	public void setAage(int aage) {
		this.aage = aage;
		
	
	}
	@Override
	public String toString() {
		return "Animal [aname=" + aname + ", aage=" + aage + "]";
	}

}
