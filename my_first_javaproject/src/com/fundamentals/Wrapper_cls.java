package com.fundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Wrapper_cls {

	/*Integer sid=45;
	Double marks= (double)456;
	Boolean pass=true;
	int i=sid;
	double d= marks;
	boolean b=pass;
	
	Integer I=i;*/
	
	String s;
	StringBuffer sb=new StringBuffer("rohitsharma");
	BigInteger bi=new BigInteger("456");
	
	BigDecimal bd=new BigDecimal("456.0");
	
	public static void main(String[] args) {
		Wrapper_cls w=new Wrapper_cls();
		
		/*System.out.println(w.sid);
		System.out.println(w.marks);
		System.out.println(w.pass);
		System.out.println(w.I);
		
*/
		w.s="rohit";
		String s1= new String ("sharma");
		
		System.out.println(s1);
		System.out.println(w.s);
		System.out.println(w.sb);
		System.out.println(w.bd);
	}

}
