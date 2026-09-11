package com.javaintro;

public class Jvm {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method");
		System.out.println(Class.forName("java.lang.System"));
		System.out.println(Class.forName("java.lang.String"));
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));

	}

}
