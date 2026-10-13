package com.fundamentals;

public class Banking {

	static int bal=1000;
	 void deposit () {
		int deposit=500;
		bal=bal+deposit;
		System.out.println("after deposit:"+bal);
		
	}
	 void withdraw () {
			int wd=300;
			bal=bal-wd;
			System.out.println("withdraw after:"+bal);
			
		}
	  
	 void display() {
		 deposit ();
		 withdraw ();
	 }
	public static void main(String[] args) {
		Banking b= new Banking();
		b.display();
		
		System.out.println("finaltotal:"+bal);
		
	}

}
