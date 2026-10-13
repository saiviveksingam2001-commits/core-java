package com.javamethods;

import java.util.Scanner;

public class LoanMgt {
	Scanner sc=new Scanner(System.in);
	String cname;
	int loanamount;
	double intrest;
	int loantenure;
	double si;
	double total;
	double calcint(double intrest) {
		 si=(loanamount*intrest*loantenure)/100;
		return si;
	}
	double caltotal(double si) {
		total=loanamount+si;
		return 		total;
	}
	double calemi(int loantenure) {
			return total/(loantenure*12);	
	}
	
	void display() {
		System.out.println(calcint(intrest));
		System.out.println(caltotal(si));
		System.out.println(calemi(loantenure));	
	}
	
	 void main(String[] args) {
		 
		 
		cname="siva";
		loanamount=10000;
		intrest=5;
		loantenure=12;
		display();
	}

}
