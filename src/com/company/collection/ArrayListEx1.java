package com.company.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList arrayList1 = new ArrayList();
		arrayList1.add("Nastya");
		arrayList1.add("Maryna");
		arrayList1.add("Ivan");
		arrayList1.add(9);
		arrayList1.add(new Car());
		System.out.println(arrayList1);
		
		ArrayList<String> arrayList2 = new ArrayList<>(200);
		arrayList2.add("Quatemala");
		arrayList2.add("Tokio");
		List<String> arrayList3 = new ArrayList<>();
		ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
		System.out.println(arrayList4);
		System.out.println(arrayList1 == arrayList4);
	}
	static class Car {
	
	}
}
