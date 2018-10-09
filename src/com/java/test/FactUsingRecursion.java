package com.java.test;

import java.util.Scanner;

public class FactUsingRecursion {
	static int output;
	public static void main(String[] args) {
		System.out.println("Enter Any Number");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Factorial Of Given Number Using Recursion Is" +factorial(num));
	}
	public static int factorial(int num) {
		output=output*factorial(num-1);
		return output;
	}
}
