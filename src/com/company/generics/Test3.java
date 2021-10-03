package com.company.generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		//List<Number> list= new ArrayList<Integer>();
		//List<Object> list= new ArrayList<Integer>();
		List<?> list= new ArrayList<Integer>();
		List<Double> list1 = new ArrayList<>();
		List<?> list3 = new ArrayList<String>();
//		list.add("hello");
		List<? extends Number> list30 = new ArrayList<Integer>();
		list1.add(3.21);
		list1.add(3.17);
		list1.add(3.10);
		showListInfo(list1);
		List<String> list2 = new ArrayList<>();
		list2.add("how");
		list2.add("you're");
		list2.add("doing");
		ArrayList<Double> arrayList = new ArrayList<>();
		arrayList.add(3.21);
		arrayList.add(3.17);
		arrayList.add(3.10);
		System.out.println(summ(arrayList));
		
		ArrayList<Integer> arrayListInt = new ArrayList<>();
		arrayListInt.add(30);
		arrayListInt.add(34);
		arrayListInt.add(35);
		System.out.println(summ(arrayListInt));
		
//		ArrayList<String> arrayListString = new ArrayList<>();
//		System.out.println(summ(arrayListString));
		
		List<? super Number> list40 = new ArrayList<Object>();
	}
	
	static void showListInfo(List<?> list) {
		System.out.println("Moi list soderzhit sleduyshie elementy: " + list);
	}
	
	public static Double summ(ArrayList<? extends Number> arrayList) {
		double summ = 0;
		for(Number n : arrayList) {
			summ+= n.doubleValue();
		}
		return summ;
	}
}
