package com.te.assignment2.collection;

import java.util.LinkedList;

public class FirstElement {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(20);
		list.add(10);
		list.add(80);
		list.add(60);

		System.out.println(list);
		System.out.println(list.peekFirst());
		System.out.println(list);

	}
}
