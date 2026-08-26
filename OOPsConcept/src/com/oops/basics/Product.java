package com.oops.basics;

import java.util.Iterator;

public class Product {
	String[] showProducts() {
		// create an array of product and return it
		String[] products = new String[] { "Laptop", "Mobile", "Mouse", "Pen" };
		return products;
		// return new String[] { "Laptop", "Mobile", "Mouse", "Pen" }; // method 2
	}

	void printCategories(String[] categories) {
		for (String cat : categories) {
			System.out.println(cat);
		}
	}

	String offerDetails() {
		return "Onam Offer Available";
	}

	public static void main(String[] args) {
		// create an object for product
		Product product = new Product();
		// call offer details
		String offer = product.offerDetails();
		System.out.println(offer);
		// call showProduct
		String[] detail = product.showProducts();
		for (String prod : detail)
			System.out.println(prod);

		// create an array fot categories
		String[] categories = new String[] { "Electronics", "Books", "Toys" };
		// pass this as parameter
		product.printCategories(categories);

	}
}
