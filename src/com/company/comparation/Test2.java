package com.company.comparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
}

class Employee implements Comparable<Employee> {
	Integer id;
	String name;
	String surname;
	int salary;
	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Employee employee1 = new Employee(20, "Zaur", "Love", 210);
		Employee employee2 = new Employee(1, "Ivan", "Sidorov", 500);
		Employee employee3 = new Employee(22, "Ivan", "Kvitka", 300);
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		System.out.println(list);
		//Arrays.sort(new Employee[]{employee1, employee2, employee3});
		Collections.sort(list, new SalaryComparator());
		System.out.println(list);
	}
	
	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", salary=" + salary +
				'}';
	}
	
	public Employee(final int id, final String name, final String surname, final int salary) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}
	
	@Override
	public int compareTo(final Employee anotherEmp) {
		//		if(this.id == anotherEmp.id) {
		//			return 0;
		//		}
		//		if(this.id < anotherEmp.id) {
		//			return -1;
		//		}
		//		else return 1;
		//		return this.id - anotherEmp.id;
		//		return this.id.compareTo(anotherEmp.id);
		int res = this.name.compareTo(anotherEmp.name);
		if (res == 0) {
			res = this.surname.compareTo(anotherEmp.surname);
		}
		return res;
	}
	
}

class IdComparator implements Comparator<Employee> {
	
	@Override
	public int compare(final Employee o1, final Employee o2) {
		if (o1.id == o2.id) {
			return 0;
		}
		if (o1.id < o2.id) {
			return -1;
		}
		else
			return 1;
	}
}

class NameComparator implements Comparator<Employee> {
	
	@Override
	public int compare(final Employee o1, final Employee o2) {
		return o1.name.compareTo(o2.name);
	}
}
class SalaryComparator implements Comparator<Employee> {
	@Override
	public int compare(final Employee o1, final Employee o2) {
		return o1.salary - o2.salary;
	}
}