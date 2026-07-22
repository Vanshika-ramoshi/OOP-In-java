package com.polymorphism;

public class Practice {

	public void display(String name) {
		System.out.println("String value :" + name);
		System.out.println("-------------------------------------");

	}

	public void display(int number) {
		System.out.println("Integer value :" + number);

	}
--------------------------------------------------------------------------------------------
package com.polymorphism;

public class Practice {
	
	public void show(int num , String name) {
		System.out.println("Integer : "+ name);
		System.out.println("String  : "+ num);
		
	}
	
	public void show(String name , int num) {
		System.out.println("String  :"+ name);
		System.out.println("Integer : "+num);
	}

}
