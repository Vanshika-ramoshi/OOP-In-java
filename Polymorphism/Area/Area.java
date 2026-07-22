package com.polymorphism;

public class Area {

	public void circle(double radius) {
		double area = Math.PI * radius * radius;
		System.out.println("Area of circle : " + area);

	}

	public void rectangle(double length, double width) {
		double area = length * width;
		System.out.println("Area of rectangle :" + area);

	}

}
