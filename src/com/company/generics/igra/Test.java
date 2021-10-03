package com.company.generics.igra;

public class Test {
	public static void main(String[] args) {
		Schoolar schoolar1 = new Schoolar("Ivan", 12);
		Schoolar schoolar2 = new Schoolar("Mariya", 15);
		
		Student student1 = new Student("Nikolay", 20);
		Student student2 = new Student("Kseniya", 18);
		
		Employee employee1 = new Employee("Zaur", 32);
		Employee employee2 = new Employee("Mikhail", 45);
		
		Team<Schoolar> schoolarTeam = new Team("Drakoni");
		schoolarTeam.addNewParticipant(schoolar1);
		schoolarTeam.addNewParticipant(schoolar2);
		Team<Employee> employeeTeam = new Team<>("Vpered!");
		employeeTeam.addNewParticipant(employee1);
		employeeTeam.addNewParticipant(employee2);
		Team<Student> studentTeam = new Team<>("Rabotyagi");
		studentTeam.addNewParticipant(student1);
		studentTeam.addNewParticipant(student2);

		Team<Schoolar> schoolarTeam2 = new Team<>("Mudreci");
		Schoolar schoolar3 = new Schoolar("Sergey", 13);
		Schoolar schoolar4 = new Schoolar("Olya", 15);
		schoolarTeam2.addNewParticipant(schoolar3);
		schoolarTeam2.addNewParticipant(schoolar4);
		schoolarTeam.playWith(schoolarTeam2);
	}
}
