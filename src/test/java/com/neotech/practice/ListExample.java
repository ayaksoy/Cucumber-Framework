package com.neotech.practice;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Banana");
		list.add("Toyota");
		list.add("Ciara");

		System.out.println(list);

		for (String item : list) {
			System.out.println(item);
		}

	}

}
