package com.java.test;

import java.util.Scanner;

public class StringPalindromeTest {
	public static void main(String[] args) {
		System.out.println("Enter Any String");
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		String test="";
		for(int i=(input.length()-1);i>=0;i--) {
			test=test+input.charAt(i);
		}
		if(test.equals(input)) {
			System.out.println("Given String is \""+input+ "\" Palindrome");
		}else
			System.out.println("Given String is Not Palindrome");
		scanner.close();
	}	
}
