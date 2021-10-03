package com.company.comparation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Class1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Zaur");
		list.add("Ivan");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
