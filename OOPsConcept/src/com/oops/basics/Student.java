package com.oops.basics;

public class Student {
	String studentName;
	int studentId;

	public Student(String name, int id) {
		this.studentName = name;
		this.studentId = id;
	}

	void printDetails() {
		System.out.println("Name " + studentName);
		System.out.println("Id " + studentId);

	}

}
