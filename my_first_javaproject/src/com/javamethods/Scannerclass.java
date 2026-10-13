package com.javamethods;

import java.util.Scanner;
public class Scannerclass {

	 void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println(" enter your customer name");
		String n=sc.nextLine();
		name (n);
		System.out.println(" enter your current bal");
		int cb= sc.nextInt();
		currentbal(cb);
		sc.close();
	}
	void name(String name) {
		System.out.println(name);
	}
	
	void currentbal(int a)
	{
		System.out.println("current bal:"+a);
	}
	
	

}
