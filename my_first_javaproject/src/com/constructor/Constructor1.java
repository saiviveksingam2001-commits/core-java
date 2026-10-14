package com.constructor;

public class Constructor1 {

	static int count=0;
	Constructor1(){
		System.out.println("constructor 1 called");
		count++;
	}
	public static void main(String[] args) {
		
		Constructor1 c=new Constructor1();
		Constructor1 c1=new Constructor1();
		System.out.println(count);
	}

}
