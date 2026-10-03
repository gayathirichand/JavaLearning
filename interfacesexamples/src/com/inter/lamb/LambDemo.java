package com.inter.lamb;

public class LambDemo {

	public static void main(String[] args) {
		IShape shape = new Square();
		shape.area(10, 20);

		IShape shape1 = (i, j) -> System.out.println("Square  "+(i * j));
		shape1.area(20,30);
		
		IShape rectangle=( x,y)->System.out.println("Rectangle "+(x*y));
		rectangle.area(3,3);
		
		IMessenger messenger = name ->{ return "Hello "+name;};
		String rs=messenger.greet("Priya");
		System.out.println(rs);
		
		messenger=name-> " Have a great day  "+ name;
        System.out.println(messenger.greet("Priyaa"));		
		
		
		
		
	}

}
