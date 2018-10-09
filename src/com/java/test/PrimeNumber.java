package com.java.test;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		//taking Number From Input Enter Any number to test
		System.out.println("Enter Any Number To Test Whether Given Number is Prime Or Not");
		//Reading Number Using Scanner
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int count=0;
		//Repeatin 
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count>1) {
			System.out.println("Given Number "+number+" is Not Prime");
		}else {
			System.out.println("Given Number "+number+" is Prime");
		}
		sc.close();
	}
}
