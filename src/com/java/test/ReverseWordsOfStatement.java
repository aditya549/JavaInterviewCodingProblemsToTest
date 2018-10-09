package com.java.test;

import java.util.Scanner;

public class ReverseWordsOfStatement {
	public static void main(String[] args) {
		System.out.println("Enter Any Statemnet");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String[] split = input.split("\\s");
		for(int i=(split.length-1);i>=0;i--) {
			System.out.print(split[i] +" ");
		}
		sc.close();
	}
}
