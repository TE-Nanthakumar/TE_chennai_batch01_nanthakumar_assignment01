package com.te.assignment2.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(40);
		list.add(20);
		
		LinkedHashSet<Integer> result = new LinkedHashSet<Integer>(list);
		System.out.println(result);
	}
}
