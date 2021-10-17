package com.te.assignment2.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class SpecifiedPosition {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		ListIterator<Integer> itr = list.listIterator(2);

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
