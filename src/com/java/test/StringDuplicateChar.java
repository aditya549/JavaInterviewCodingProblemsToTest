package com.java.test;

import java.util.ArrayList;
import java.util.Scanner;

public class StringDuplicateChar {
	public static void main(String[] args) {
		System.out.println("Enter Any String To Find Duplicate Values");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		int count=0;
		ArrayList<Character> al=new ArrayList<>();
		char[] ch=input.toCharArray();
		for (int j = 0; j < ch.length; j++) {
			for (int i = 0; i < ch.length; i++) {
				if(ch[j]==ch[i]) {
					count++;
				}
			}
			if(al.contains(ch[j])) {
				break;
			}else {
				if(count>1) {
				System.out.println(ch[j]+ "---" +count);
				al.add(ch[j]);
				count=0;
				}
				else {
					break;
				}
			}
				
		}
	}
}
