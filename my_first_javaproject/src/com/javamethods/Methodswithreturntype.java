package com.javamethods;

public class Methodswithreturntype {

	static  int maxi(int a,int b) {
		if (a>b)
		{
			return a;
		}
		else 
		{
			return b;
		}
	}
	
	public static void main(String[] args) {
		
		int a=maxi(5,45);
		System.out.println(a);
   
    }	
}
