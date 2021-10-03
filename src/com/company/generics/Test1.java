package com.company.generics;

import java.util.ArrayList;
import java.util.List;

import com.company.generics.igra.Student;

public class Test1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("ok");
//		list.add(4);
//		list.add(new Student("kolya", 14));
		for (Object o: list) {
			System.out.println(o + "dlina"+ ((String)o).length());
		}
		
	}
}
