package com.java.core;

public class Statements_Example {
	
	public static void main(String[] args) {
		int n = 6;
		
		  if(n<4) 
			  System.out.println("n is greater"); 
		  else if(n==4)
			  System.out.println("n is equal"); 
		  else if(n % 2 == 0)
			  System.out.println("n is even"); 
		  else 
			  System.out.println("n is smaller");
		 
		
		if (n % 2 == 1) {
			System.out.println("odd number");
			if (n >10)
				System.out.println("n is bigger than 10");
			else
				System.out.println("n is smaller");	
		}
		else {
			System.out.println("n is even");
		}
	}
}
