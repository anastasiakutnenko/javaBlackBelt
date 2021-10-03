package com.company.collection;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
	public static void main(String[] args) {
		Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
		Student st2= new Student("Nikolay", 'm', 33, 3, 9.3);
		Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
		Student st4 = new Student("Piotr", 'm', 34, 3, 9.8);
		Student st5 = new Student("Mariya", 'f', 21, 2, 8.1);
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(st1);
		studentList.add(st2);
		studentList.add(st3);
		studentList.add(st4);
		studentList.add(st5);
		Student st6 = new Student("Mariya", 'f', 21, 2, 8.1);
		
		System.out.println(studentList);
		int
		//studentList.remove(st6);
		System.out.println(studentList);
	}
}

class Student {
	private String name;
	private char sex;
	private int age;
	private int course;
	private double avgGrade;
	
	public Student(String name, char sex, int age, int course, double avgGrade) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.course = course;
		this.avgGrade = avgGrade;
	}
	
	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", sex=" + sex +
				", age=" + age +
				", course=" + course +
				", avgGrade=" + avgGrade +
				'}';
	}
	
//	@Override
//	public boolean equals(final Object o) {
//		if (this == o)
//			return true;
//		if (o == null || this.getClass() != o.getClass())
//			return false;
//		final Student student = (Student) o;
//		return this.sex == student.sex && this.age == student.age && this.course == student.course && Double.compare(student.avgGrade, this.avgGrade) == 0 && Objects.equals(this.name, student.name);
//	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.sex, this.age, this.course, this.avgGrade);
	}
}
