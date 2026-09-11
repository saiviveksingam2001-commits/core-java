package com.javaintro;

public class Garbagec {

	protected void finalize () {
		System.out.println("finalize method");
	}
	void method () {
		Garbagec gc4= new Garbagec();
	}
	public static void main(String[] args) {
		Garbagec c= new Garbagec();
		c=null; //nullyfing
		
		
		Garbagec gc1= new Garbagec();
		Garbagec gc2= new Garbagec();
		gc1=gc2; //reassign
		Garbagec gc5= new Garbagec();
       gc5.method();//method
       
       new Garbagec();//annonumous
       System.gc();
	}

}
