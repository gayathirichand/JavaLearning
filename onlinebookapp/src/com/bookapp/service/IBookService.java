package com.bookapp.service;

import java.util.List;

import com.bookapp.model.Book;

public interface IBookService {
	List<Book> getAll();
	Book getById(int bookId);
	List<Book> getByTitleContains(String title);
	List<Book> getByLesserPrice(double price);
    List<Book> getByAuthCategory(String author, String category);


}
//create the implementation class
//create the bookdetails class in com.bookapp.util
//create the client class in com.bookapp.main