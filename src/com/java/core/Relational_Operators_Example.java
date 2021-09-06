package com.java.core;

public class Relational_Operators_Example {
	public static void main(String[] args) {
		int n = 5;
		int m = 9;
		
		boolean r = n<m;
		System.out.println(n + " < " + m + " : " + r);
		
		r = n>m;
		System.out.println(n + " > " + m + " : " + r);
		
		r = n>=m;
		System.out.println(n + " >= " + m + " : " + r);
		
		r = n<=m;
		System.out.println(n + " <= " + m + " : " + r);
		
		r = n!=m;
		System.out.println(n + " != " + m + " : " + r);
	}
}
