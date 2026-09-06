package com.basics.quest3;

public class Student {
	String name;
	String department;

	Student(String name, String department) {
		this.name = name;
		this.department = department;
	}

	void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("Department: " + department);
	}

	String getGrades(int[] marks) {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		int avg = sum / marks.length;
		if (avg >= 90) {
			return "A";
		} else if (avg >= 80) {
			return "B";
		} else if (avg >= 70) {
			return "C";
		} else if (avg >= 60) {
			return "D";
		} else if (avg >= 50) {
			return "E";
		}
		return "Fail";

	}
}
