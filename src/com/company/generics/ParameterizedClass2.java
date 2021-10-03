package com.company.generics;

public class ParameterizedClass2 {
	public static void main(String[] args) {
		Pair<String, Integer> pair1 = new Pair<>("hello", 30);
		System.out.println("value1: " + pair1.getFirstValue() + "and value2: " + pair1.getSecondValue());
		Pair<Integer, Double> pair2 = new Pair<>(90, 21.9);
		System.out.println("value1: " + pair2.getFirstValue() + "and value2: " + pair2.getSecondValue());
		AnotherPair<String> anotherPair= new AnotherPair<>("firstString", "secondString");
	}
}

class Pair<V1, V2> {
	private V1 value1;
	private V2 value2;
	
	public Pair(V1 value1, V2 value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public V1 getFirstValue() {
		return this.value1;
	}
	
	public V2 getSecondValue() {
		return this.value2;
	}
}

class AnotherPair<V> {
	private V value1;
	private V value2;
	
	public V abc(V value) {
		return value;
	}
	
	public AnotherPair(V value1, V value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public V getFirstValue() {
		return this.value1;
	}
	
	public V getSecondValue() {
		return this.value2;
	}
}



	
	
