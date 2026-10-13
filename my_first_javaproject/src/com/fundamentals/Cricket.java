package com.fundamentals;

public class Cricket {
    static {
    	a();
    }
	static void a()
	{
		
		System.out.println("method A" );
		b();
	}
	
	static void b()
	{
		
		System.out.println("method b" );
		Cricket x= new Cricket();
		x.c();
		
		
	}
	 void c()
	{
		 System.out.println("method c" );
		 d();
		
	}
	 void d()
		{
		 
			System.out.println("method D" );
			e();
		}
	 
	 static void e() {
		 System.out.println(" method e");
	 }
	 
	public static void main(String[] args) {
		//System.out.println("main method started" );
		
		//System.out.println("main method ended" );
	}

}
