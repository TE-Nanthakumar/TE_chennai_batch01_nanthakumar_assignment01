package com.te.assignment2.collection;

import java.util.LinkedList;

public class FirstAndLastElement {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("dhoni");
		list.add("shewag");
		list.add("virat");
		list.add("rohit");

		System.out.println(list.getFirst());
		System.out.println(list.getLast());

	}
}
