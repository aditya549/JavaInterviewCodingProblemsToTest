package com.java.test;


import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicateElementsUsingMAP {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,10,20,30,40,10,10};
		Map<Integer, Integer> map=new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if(map.containsKey(a[i])){
				map.put(a[i], map.get(a[i])+1);
			}else
			map.put(a[i], 1);
		}
		System.out.println(map.toString());
	}
}
