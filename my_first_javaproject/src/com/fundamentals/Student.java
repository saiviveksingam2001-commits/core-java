package com.fundamentals;

public class Student {
	
      static int clgcode=566544;
      int roll;
      String sname;
      int marks;
      
	static {
		System.out.println("vaagdevi clg of degree and pg");
	}
	{
		System.out.println("student object is created");
	}
	static void display() {
		System.out.println("clgcode="+clgcode);
		
		
		
	}
	void display2() {
		
		System.out.println(roll);
		System.out.println(sname);
		System.out.println(marks);
	}
	
	public static void main(String[] args) {
		 Student s1=new Student ();
		//Student s2=new Student ();
		s1.roll=45;
		s1.sname="vivek";
		s1.marks=65;
		display();
		s1.display2();
		

	}

}
