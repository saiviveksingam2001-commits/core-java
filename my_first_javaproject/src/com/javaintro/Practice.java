package com.javaintro;

public class Practice {

	public static void main(String[] args) {
		System.out.println('b');
		int a=43;
		int sum=0;
		//int mult=1;
		int count=0;
		
		for (int i=43;i>0;i=i/10)
		{
			sum=sum+(i%10);
		}
		
		for (int i =1;i<=sum;i++)
		{
			if(sum%i==0) {
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("the sum is prime"+sum);
		}
		
		else
			System.out.println("the sum is not prime"+sum);
	}

}
