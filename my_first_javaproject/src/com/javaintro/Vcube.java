package com.javaintro;

public class Vcube {

	static String trainee1;
	static String trainee2;
	
	String ename;
	int empid;
	String edesignation;
	public static void main(String[] args) {
		Vcube.trainee1="vishwa";
		Vcube.trainee1="srikanth";
		Vcube v= new Vcube();
		v.ename="emp1";
		v.empid=45;
		v.edesignation="lab incharge";
		
		System.out.println(Vcube.trainee1);
		System.out.println(Vcube.trainee2);
		System.out.println(v.ename);
		System.out.println(v.empid);
		System.out.println(v.edesignation);
		
		

	}

}
