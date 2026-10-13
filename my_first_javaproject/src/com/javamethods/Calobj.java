package com.javamethods;

public class Calobj {

	static int count=0;
	Calobj(){
		count++;
	}
	
	public static void main(String[] args) {
		
		Calobj c= new Calobj();
		Calobj c1= new Calobj();
		
		System.out.println(count);
		
	}

}
//Git commit test