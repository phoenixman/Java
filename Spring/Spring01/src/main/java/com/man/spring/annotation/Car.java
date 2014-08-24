package com.man.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class Car {
	private String brand="aodi";
	private float price=12000.0f;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "car:brand="+brand+" price="+price;
	}
	
}
