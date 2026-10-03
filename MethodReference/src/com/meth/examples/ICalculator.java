package com.meth.examples;

@FunctionalInterface
public interface ICalculator {
	void calculate(int x, int y);

}


interface IGreeter{
	String greetUser(String name);
}