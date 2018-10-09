package com.java.test;

import java.util.Scanner;

public class ElemenateNumbersInString {
	public static void main(String[] args) {
		System.out.println("Enter Any String With Numbers");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		for(int i=0;i<input.length();i++) {
			if(Character.isDigit(input.charAt(i))) {
				continue;
			}
		System.out.print(input.charAt(i));
		}
		sc.close();
	}
}
