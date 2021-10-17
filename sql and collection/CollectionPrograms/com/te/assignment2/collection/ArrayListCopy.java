package com.te.assignment2.collection;

import java.util.ArrayList;

public class ArrayListCopy {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);

		ArrayList<Integer> newList = new ArrayList<Integer>(list);

		System.out.println(newList);
	}
}
