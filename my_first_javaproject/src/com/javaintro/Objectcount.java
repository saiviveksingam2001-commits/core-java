package com.javaintro;

public class Objectcount {

	static int count=0;
	
	 {
		count++;
	}
	
	
	public static void main(String[] args) {
		Objectcount o= new Objectcount();
		Objectcount o1= new Objectcount();
		System.out.println(count);
	}

}
