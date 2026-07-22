package com.polymorphism;

import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
    Practice p = new Practice ();	 
    
		System.out.println("Enter name");
		String name = sc.nextLine();
		p.display(name);
		
		System.out.println("Enter Number ");
		int number = sc.nextInt();
		p.display(number);
    
	}
}
