package com.fundamentals;

public class StudentMarks {
	static StudentMarks s=new StudentMarks();
	
	String sname;
	int rollno;
	String course;
	int sub1;
	int sub2;
	int sub3;
	
	int total;
	double avg;
	static void studentdetails() {
       System.out.println(s.sname);
       System.out.println(s.rollno);
       System.out.println(s.course);
       System.out.println(s.sub1); 
       System.out.println(s.sub2);
       System.out.println(s.sub3); 
       
	}
	
	static void cal()
	{
		s.total=s.sub1+s.sub2+s.sub3;
		System.out.println("total="+s.total);
	}	
	static void calavg() {
		s.avg=(s.total)/3;
		System.out.println(s.avg);
	}
	public static void main(String[] args) {
		
		s.sname="shiva";
		s.rollno=45;
		s.course="java";
		s.sub1=99;
		s.sub2=98;
		s.sub3=96;
		studentdetails();
		cal();
		calavg();
		
			
	}

}
