package com.constructor;

public class Experiment {
int a;
String c;
	Experiment(int a,String b){
		this.a=a;
		c=b;
		
	}
	public static void main(String[] args) {
		Experiment e= new Experiment(1,"something");
		e.c="nothing";
		e.method();
	}
	void method() {
		System.out.println(a);
		System.out.println(c);
		
	}
	

}
