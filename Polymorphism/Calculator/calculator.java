package com.polymorphism;

public class Calculator {
	
	public void add(int a ,int b) {
	int sum = a + b;
	System.out.println("Addition of two numbers : "+ sum);
	}
	
	public void add( int a , int b, int c) {
		int sum = a + b + c;
		System.out.println("Addition of three numbers : "+ sum);
	}

	public void multiply(int a , int b) {
		int sum = a * b;
		System.out.println("Multiplication of two number : "+ sum);
		
	}
	public void multiply(double a, double b) {
		double sum = a * b;
		System.out.println("Multiplication of two number :"+ sum);
	}
}
