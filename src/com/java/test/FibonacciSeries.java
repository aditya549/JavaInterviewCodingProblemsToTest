package com.java.test;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Enter Any Number To Find Fibonacci Series UPTO");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int temp=1,count=1,temptest;
		for(temptest=1;temptest<=number;) {
			temptest=temp+count;
			System.out.print(count+ " ");
			temp=count;
			count=temptest;	
		}
		sc.close();
	}
}
