
package com.bookapp.service;

import java.util.Comparator;

import com.bookapp.model.Book;

public class AuthSort implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// reverse sorting
		return o2.getAuthor().compareTo(o1.getAuthor());
	}

}
