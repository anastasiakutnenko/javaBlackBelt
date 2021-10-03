package com.company.generics;

import java.util.ArrayList;
import java.util.List;

public class ParameterizedClass {
//	public void abc(Info<String> info) {
//		String s = info.getValue();
//	}

	public void abc(Info<Integer> info) {
		Integer s = info.getValue();
	}
}

class Info<T> {
	private T value;
	
	public static void main(String[] args) {
		Info<String> info1 = new Info<>("hello");
		System.out.println(info1);
		Info<Integer> info2 = new Info<>(2);
		System.out.println(info2);
		String s = info1.getValue();
		Integer g = info2.getValue();
	}
	public Info(T value) {
		this.value = value;
	}
	
	public String toString() {
	  	return "{[" + value + "]}";
	}
	
	public T getValue() {
		return value;
	}
}

class Parent{
		public void abc(Info<Integer> info) {
			Integer s = info.getValue();
		}
}

//class Child extends Parent{
//	public void abc(Info<String> info) {
//		String s = info.getValue();
//	}
//}
