package com.klu.demo;

public class Car {

	private Engine obj;
	
	
	public Car(Engine obj) {	
		this.obj=obj;	
	}
	
	
	public void drive() {
		obj.start();
		System.out.println("Car is moving");
	}
	
	
	
	
	
}
