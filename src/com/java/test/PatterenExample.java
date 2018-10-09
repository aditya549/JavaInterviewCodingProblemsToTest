package com.java.test;

public class PatterenExample {
	public static void main(String[] args) {
		 /*Print *
		 		 **
		 		 ***
		 		 **** Pattern 	
		 */
		for(int i=1;i<=20;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	} 
}
