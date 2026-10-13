package com.javamethods;
import java.util.Scanner;
public class ExperimentsMethods {

	int s1=0;
	int s2=0;
	int s3=0;
	int sum=0;
	Scanner sc= new Scanner (System.in);
	 void main(String[] args) {
		
		
		System.out.println(total());
		System.out.println(avg());
	}

	double total() {
		int s1=56;
		int s2=96;
		int s3=69;
		sum =s1+s2+s3;
		return sum;
	}
	double avg()
	{
		return sum/3;
	}
	
}
