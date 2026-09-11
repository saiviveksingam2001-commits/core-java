package com.javaintro;

import java.util.Scanner; 
public class Static {

	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		  System.out.println("Enter a number"); 
		  int n = scan.nextInt(); 
		  int count = 0; 
		  for (int i=2;i<n ;i++ ) 
		  { 
		   if (n%i==0) 
		   { 
		    count++; 
		   } 
		  } 
		  
		  if (count==0) 
		  { 
		   System.out.println("Prime Number"); 
		  } 
		  else  
		                        { 
		   System.out.println("Not a prime number"); 
		  } 
	
		
	}
	}


