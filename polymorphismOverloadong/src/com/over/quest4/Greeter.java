package com.over.quest4;

import java.util.Iterator;

public class Greeter {
	String name;

	public Greeter() {
		super();
	}

	public Greeter(String name) {
		super();
		this.name = name;
	}

	void greetUser(String... messages) {
		
		for (String message : messages) {
			System.out.println(name +" "+message);
			
		}
	}

	void sayHello(String... names) {
		
		for (String name : names) {
			System.out.println("Welcome  "+name);
			
		}
	}
}
