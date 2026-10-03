package com.over.quest1;

public class OverloadMain {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Rohan", "Programmer");
		Employee employee2 = new Employee("Ragul", "Programmer");
		Employee employee3 = new Employee("Prabhu", "Manager");
		Employee employee4 = new Employee("Lakshmi", "Manager");
		Employee employee5 = new Employee("Shilpi", "Director");
		Employee[] employeeArray = { employee1, employee2, employee3, employee4, employee5 };

		for (Employee employee : employeeArray) {
			if (employee.designation.equals("Programmer")) {
				employee.calcBonus(10000);
			} else if (employee.designation.equals("Manager")) {
				employee.calcBonus(20000, "AC");

			} else if (employee.designation.equals("Director")) {
				employee.calcBonus(20000,"AC",10000);

			} else {
			}

		}
	}
}
