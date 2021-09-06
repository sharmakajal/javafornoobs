package com.java.core;

public class Conditional_Example {
	public static void main(String[] args) {
		int n = 5;
		if(n % 2 == 1 && n ==6) {
			System.out.println("n is odd and != 5");
		}
		else if(n % 2 == 0 || n == 5 )
		{
			System.out.println("n is equal to 5");
		}
	}
}
