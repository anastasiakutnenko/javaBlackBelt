package com.company.generics;

import java.util.ArrayList;

public class ParameterizedMethod {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(10);
		al1.add(20);
		al1.add(5);
		int a = GenMethod.getSecondMethod(al1);
		System.out.println(a);
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("one");
		al2.add("two");
		al2.add("three");
		String b = GenMethod.getSecondMethod(al2);
		System.out.println(b);
	}
}
class GenMethod{
	public static <T> T getSecondMethod(ArrayList<T> al) {
		return al.get(1);
	}
}
