package com.shubham;

import java.util.List;
import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(40);
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(60);
		list.add(20);
		
//		System.out.println(list);
		
		for(int i:list)
		{
			System.out.println(i);
		}
		
	}
}
