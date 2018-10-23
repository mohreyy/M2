package com.cg.SpringOne.service;

public class Triangle implements Shape {

	String sides;
	
	
	public String getSides() {
		return sides;
	}


	public void setSides(String sides) {
		this.sides = sides;
	}


	@Override
	public void getShape() {
		
		System.out.println("In Triangle............."+sides);
	}

}
