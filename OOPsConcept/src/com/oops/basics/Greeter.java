package com.oops.basics;

public class Greeter {
	void printMessage(String... names) {
		// iterate and print the message as "Great Day, PRIYA!!! "
		for (String val : names) {
			System.out.println("Great Day " + val+"!!!");
		}
	}

	void printMessageWithName(String name, String... messages) {
		// iterate thru messages and print as "message 1", +name => Hello Priya, Welcome
		// Priya, Bye Bye Priya
		for(String msg: messages) {
			System.out.println(msg+ " " +name);
		}
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		greeter.printMessage("Gaythiri", "Ashwitha", "Kishore");
	greeter.printMessageWithName("Gayathiri", "hello","hi","hwru?");}
}
