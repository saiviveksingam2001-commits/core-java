package com.fundamentals;

public class Choclate {

	static int bal=450;
	static int choccost=15;
	static int cooccost=10;
	
  static	int c1=10*choccost;
     static	int c2=5*cooccost;
	
	
	public static void main(String[] args) {
		int fbal=bal-c1;
		int f2bal=fbal-c2;
		
		
		System.out.println("finalbalance="+f2bal);
		
		
	}

}
