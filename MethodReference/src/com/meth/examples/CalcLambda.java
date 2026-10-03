package com.meth.examples;

public class CalcLambda implements ICalculator, IGreeter {
	public static void main(String[] args) {
		// add
		ICalculator cl = (x, y) -> System.out.println(x + y);

		cl.calculate(2, 3);
		// sub
		cl = (x, y) -> System.out.println(x - y);

		cl.calculate(9, 3);
		// multiplication
		cl = (x, y) -> System.out.println(x * y);

		cl.calculate(20, 3);

		IGreeter greet = name -> {
			return "Hello " + name;
		};
		String rs = greet.greetUser("Gayu");
		System.out.println(rs);
	}

	@Override
	public void calculate(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public String greetUser(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
