package com.cg.SpringOne.service;

public class Circle implements Shape{

	String radius; //instance variables
	
	public String getRadius() {
		return radius;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

	@Override
	public void getShape() {
		
		System.out.println("in circle..............."+radius);
		
	}

}
