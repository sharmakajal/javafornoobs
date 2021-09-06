package com.java.core;

public class Variables_Example {

	public static void main(String[] args) {
		//whole numbers
		//byte 2^8 -128 -> 127
		//short 2^16 - 32,768 -> 32767
		//int - 2^32 -> 2^32-1
		//long - 2^63 -> 2^63 -1
		//double - 64 bit
		//float - 32 bit
		//boolean = true / false
		
		byte num1 = 127; //(as its values til 127, if passed 128 it wont work)
		System.out.println(num1);
		
		/*
		 * byte num1 = 128; //(as its values til 127, if passed 128 it wont work)
		 * System.out.println(num1); java.lang.Error: Unresolved compilation problem:
		 * Type mismatch: cannot convert from int to byte
		 */
	
		short num2 = (short) 32769; //If given this way - output is - 32767
		System.out.println(num2);
		
		short num3 = 190;
		System.out.println(num3);
		
		int num4 = 20;
		System.out.println(num4);
		
		long num5 = 1900909090;
		System.out.println(num5);
		
		float num6 = 10.000000f; //output - 10.0
		System.out.println(num6);
		
		double num7 = 190.90909090; //output - 190.9090909
		System.out.println(num7);
		
		boolean value = true;
		System.out.println(value);
		
		char somechar = 'I'; // prints only one char, value should be in ' ' single quotes
		System.out.println(somechar);
		
		String somestring = "This is a string"; //should be in double quotes
		System.out.println(somestring);
		
	}
}
