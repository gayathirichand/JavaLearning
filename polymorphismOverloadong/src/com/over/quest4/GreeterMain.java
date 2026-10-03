package com.over.quest4;

public class GreeterMain {
	public static void main(String[] args) {
		Greeter greeter = new Greeter("Sara");
		greeter.greetUser("welcome", "Great day");
		greeter.greetUser("Good Day", "Have Tea", "Enjoy Learning");
		System.out.println();

		Greeter greeter1 = new Greeter();
		greeter1.sayHello("Sri", "Priya");
		greeter1.sayHello("Sara", "Anna", "Reena", "Rohan");
		greeter1.sayHello("Jo", "Roni","Krish","Sam","Veena");
	}

}