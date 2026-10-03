package com.bookapp.main;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bookapp.model.Book;
import com.bookapp.service.AuthSort;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class SortedClient {

	public static void main(String[] args) {

		IBookService bookService = new BookServiceImpl();
		System.out.println("Get all books");
		List<Book> books =  bookService.getAll();
		System.out.println("Sort by author");
		Comparator<Book> authsort = new AuthSort();
		Collections.sort(books, authsort  ); 
		for (Book book :books) {
			System.out.println(book);
		}
		System.out.println();
		System.out.println();
		System.out.println("Sort By author");
		Comparator<Book> authorsort = (o1,  o2)->{
			return o1.getAuthor().compareTo(o2.getAuthor());
		};
		Collections.sort(books, authorsort  ); 
		for (Book book :books) {
			System.out.println(book);
		}
		System.out.println();
		System.out.println("Sort By title");
		Collections.sort(books,(o1,  o2)->o2.getTitle().compareTo(o1.getTitle()));
		for (Book book :books) {
			System.out.println(book);
		} 
		System.out.println();
		System.out.println("Sort By Price");
		Collections.sort(books,(o1,o2)->Double.compare(o1.getPrice(), o2.getPrice()));
		for (Book book :books) {
			System.out.println(book);
		}
		
			}
}
      
      