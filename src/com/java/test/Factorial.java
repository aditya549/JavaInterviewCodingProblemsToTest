package com.java.test;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter Any Number::");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int fact=1;
			for(int j=1;j<=input;j++) {
				fact=fact*j;	
			}
			System.out.println("Factorial Of Given Number is ::: "+ fact);
		sc.close();
	}
}
