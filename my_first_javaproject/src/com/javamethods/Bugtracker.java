package com.javamethods;

public class Bugtracker {

	   int bugid;
	   String bugApp;
	   String bugTitle;
	   String severity;
	   String priority;
	   String status;
	   
	   int getid() {
		   return bugid;
	   }
	   String getapp() {
		   return bugApp;
	   }
	   
	   String gettitile() {
		   return bugTitle;
	   }
	   
	   String getseverity() {
		   return severity;
	   }
	   
	   String getprior() {
		   return priority;
	   }
	   String stat() {
		   return status;
	   }
	   
	   
	public static void main(String[] args) {
		Bugtracker b=new Bugtracker();
		b.bugid=4125;
		b.bugApp="emp portal";
		b.bugTitle="null pointer exception";
		b.severity="critical";
		b.priority="low";
		b.status="assign";
		
		int bug= b.getid();
		String application=b.getapp();
		String title=b.gettitile();
		String sev=b.getseverity();
		String prior=b.getprior();
		String statu=b.stat();
		
		System.out.println(bug);
		System.out.println(application);
		System.out.println(title);
		System.out.println(sev);
		System.out.println(prior);
		System.out.println(statu);
		
	}

}
