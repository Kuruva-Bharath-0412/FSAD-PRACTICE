package com.klu.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductOrder {
	
	private int orderId;
	private String customerName;
	private String productName;
	private int  quantity;
	
	
	public ProductOrder(@Value("101") int orderId, @Value("kuruva")String customerName){	
		this.orderId=orderId;
		this.customerName=customerName;	
	}
	
	@Value("mouse")
	public void setProductName(String productName) {
		this.productName=productName;
	}
	
	@Value("5")
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	
	public void display() {

		System.out.println("fallowing are the order detail:");
		System.out.println("OrderId:"+orderId);
		System.out.println("Cn:"+customerName);
		System.out.println("Pn:"+productName);
		System.out.println("Quantity:"+quantity);
		
	}
	

}
