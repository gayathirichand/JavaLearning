package com.basics.quest5;

public class MobileMain {

	public static void main(String[] args) {

		Mobile mobile1 = new Mobile("A", "Samsung", "Black", 29000);
		Mobile mobile2 = new Mobile("S23", "Samsung", "White", 50000);
		Mobile mobile3 = new Mobile("iPhone 15", "Apple", "Black", 60000);
		Mobile mobile4 = new Mobile("Pixel 8", "Google", "Blue", 45000);
		Mobile mobile5 = new Mobile("A55", "Samsung", "Green", 35000);

		Mobile[] mobileArray = new Mobile[5];

		mobileArray[0] = mobile1;
		mobileArray[1] = mobile2;
		mobileArray[2] = mobile3;
		mobileArray[3] = mobile4;
		mobileArray[4] = mobile5;

		for (Mobile mobile : mobileArray) {
			mobile.getDetails();
		}

		System.out.println("Samsung Mobiles:");

		for (Mobile mobile : mobileArray) {

			if (mobile.brand.equals("Samsung")) {
				mobile.getDetails();
			}
		}
	}
}