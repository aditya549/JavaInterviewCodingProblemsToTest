package com.java.test;

import java.util.Scanner;

public class StringDuplicateWithoutUsingCollections {
	public static void main(String[] args) {
		System.out.println("Enter Any String");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		int count=0;
		String output = "";
		for(int i=0;i<input.length();i++) {
			for (int j = 0; j < input.length(); j++) {
				if(input.charAt(i)==input.charAt(j)) {
					count++;
				}
			}
				if(output.contains(Character.toString(input.charAt(i)))) {
					count=0;
					break;
				}
				if(count>1) {
				System.out.println(input.charAt(i)+" ---"+count);
				count=0;
				}
				count=0;
				output=output+input.charAt(i);
		}
		System.out.println("Debugging Statement...!!!!!!!");
	}
}
