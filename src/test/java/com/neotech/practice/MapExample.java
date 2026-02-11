package com.neotech.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		Map<String, String> map = new LinkedHashMap<>();

		map.put("firstName", "Maya");
		map.put("lastName", "C.");
		map.put("age", "25");

		System.out.println(map);

		System.out.println(map.get("firstName"));
		System.out.println(map.get("age"));

	}

}
