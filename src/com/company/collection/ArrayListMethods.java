package com.company.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
		public static void main(String[] args) {
			ArrayList<String> arrayList1 = new ArrayList<>();
			arrayList1.add("Nastya");
			arrayList1.add("Maryna");
			arrayList1.add("Ivan");
			arrayList1.add(1, "Misha");
			arrayList1.set(1, "Vova");
			for(String s: arrayList1) {
				System.out.print(s + " ");
			}
//			ArrayList<Integer> arrayList2 = new ArrayList<>();
//			arrayList2.add(6);
			//System.out.println(arrayList1.get(2));
		}
}
