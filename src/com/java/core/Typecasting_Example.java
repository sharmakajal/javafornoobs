package com.java.core;

public class Typecasting_Example {
	public static void main(String[] args) {
		int num = 97;
		char a = 'a';
		String somestring = "200";
		System.out.println(a);
		System.out.println((int)a); // prints - a's int value = 97
		System.out.println((char)num); //prints - num's char value = a
		int b = Integer.parseInt(somestring);
		System.out.println(num+b);
		System.out.println(somestring+b);
		Integer e = 128 ;
		Integer d = 128 ;
		System.out.println(e==d); //result false - Numbers between -128 and 127 are true.
		Integer p = 127 ;
		Integer q = 127 ;
		System.out.println(p==q); //result true
		
	}
}
