package com.inter.lamb;

public class Square implements IShape {

	@Override
	public void area(int i, int j) {
		System.out.println("Square  "+(i * j));		
	}

}
