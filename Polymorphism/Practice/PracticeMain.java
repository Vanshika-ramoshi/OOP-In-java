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
---------------------------------------------------------------------------------------------
package com.polymorphism;

import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
        Practice p = new Practice ();	
	
	
	    System.out.println("Enter number ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name");
		String name = sc.nextLine();
		
		p.show(num, name);
		sc.nextLine();
		System.out.println("Enter name ");
		String Name = sc.nextLine();
		
		System.out.println("Enter num");
		int number = sc.nextInt();
		
		p.show(name, num);
		
	}
}
