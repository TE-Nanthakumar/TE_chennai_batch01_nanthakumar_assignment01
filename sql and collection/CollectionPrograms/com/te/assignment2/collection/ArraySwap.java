package com.te.assignment2.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySwap {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("apple");
		list.add("orange");
		list.add("lemon");
		list.add("butter fruit");
		list.add("strawberry");

		System.out.println(list);

		Collections.swap(list, 3, 2);
		System.out.println(list);

	}
}
