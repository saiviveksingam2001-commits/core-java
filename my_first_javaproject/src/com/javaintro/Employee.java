package com.javaintro;

public class Employee {

	static int count=0;
	
	 {
		count++;
	}
	
	
	public static void main(String[] args) {
		Employee e= new Employee();
		Employee e1= new Employee();
		System.out.println(count);
	}

}
