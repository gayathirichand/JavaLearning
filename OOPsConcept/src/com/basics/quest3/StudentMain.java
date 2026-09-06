package com.basics.quest3;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student("Kumar", "IT");
		int[] mark1 = { 80, 70, 60, 45, 66 };

		Student student2 = new Student("Gayathiri", "EEE");
		int[] mark2 = { 30, 40, 35, 45, 36 };
		System.out.println("Student 1 Details");
		student1.printDetails();
		String student1Grade = student1.getGrades(mark1);
		System.out.println("Grade :"+student1Grade);

		System.out.println("Student 2 Details");

		student2.printDetails();
		String student2Grade = student2.getGrades(mark2);
		System.out.println("Grade :"+student2Grade);

	}

}
