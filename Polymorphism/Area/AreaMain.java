package com.polymorphism;

import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		Area a = new Area();
	
		
		System.out.println("Enter radius :");
		double radius = sc.nextDouble();
		a.circle(radius);
		
		System.out.println("Enter length :");
		double length = sc.nextDouble();
		
		System.out.println("Enter width :");
		double width = sc.nextDouble();
		a.rectangle(length , width);
	    
	}
}
