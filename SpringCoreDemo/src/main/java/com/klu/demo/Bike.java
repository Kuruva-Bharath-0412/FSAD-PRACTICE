package com.klu.demo;

public class Bike {

	
	
	private Engine obj;
	
	
	
	
	public void setEngine(Engine obj) {
		this.obj=obj;
	}
	
	public void ride() {
		obj.start();
		System.out.println("Boke is started");
		
	}
	
	
	
	
	
	
	
	
}
