package com.over.quest1;

public class Employee {
	String name;
	String designation;

	public Employee(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}

	void calcBonus(double basicAllowance) {
		System.out.println("Eligible for only \033[1mBasic Allowance\033[0m");
		System.out.println("Name:" + name);
		System.out.println("Designation:" + designation);
		System.out.println("Basic Allowance:" + basicAllowance);

	}

	void calcBonus(double basicAllowance, String gift) {// add simple print stmts
		System.out.println("Eligible for only \033[1mBasic Allowance and Gift\033[0m");

		System.out.println("Name:" + name);
		System.out.println("Designation:" + designation);
		System.out.println("Basic Allowance:" + basicAllowance);
		System.out.println("Gift:" + gift);

	}

	void calcBonus(double basicAllowance, String gift, double houseAllowance) {
		System.out.println("Eligible for \033[1mBasic Allowance,Gift and House Allowance\033[0m");

		System.out.println("Name:" + name);
		System.out.println("Designation:" + designation);
		System.out.println("Basic Allowance:" + basicAllowance);
		System.out.println("Gift:" + gift);
		System.out.println("Designation:" + houseAllowance);

	}
}