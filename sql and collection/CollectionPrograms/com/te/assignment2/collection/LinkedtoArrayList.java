package com.te.assignment2.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedtoArrayList {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(30);
		list.add(20);
		list.add(10);
		list.add(40);
		list.add(20);
		
		System.out.println("Linked List result" + list);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(list);
		System.out.println("Array List result" + list1);
	}
}
