package com.basics.quest1;

public class BookMain {
	public static void main(String[] args) {
		Book book1 = new Book("Java Programming", "James", 650, "Programming");
		Book book2 = new Book("SQL Basics", "John", 400, "Database");
		book1.getDetails();
		book1.checkBookType();
		
		System.out.println("----------------");

		book2.getDetails();
		book2.checkBookType();
	}
}
