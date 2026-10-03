package com.bookapp.service;

import java.util.ArrayList;
import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService{
	@Override
	public List<Book> getAll() {
		List <Book>books = BookDetails.showBooks();
		return books;
	}

	@Override
	public Book getById(int bookId) {
		List<Book> books = BookDetails.showBooks();
		for ( Book book : books) {
			if(book.getBookId()==bookId) {
				return book;
			}
		}
		throw new BookNotFoundException("invalid id");
	}

	@Override
	public List<Book> getByTitleContains(String title) {
		List<Book> books = BookDetails.showBooks();
		List<Book> booksByTitle = new ArrayList<>();

		for ( Book book : books) {
			if(book.getTitle().contains(title)) {
				booksByTitle.add(book);
			}
		}
			if(booksByTitle.isEmpty())
				throw new BookNotFoundException("book containing this title does not exist");
			return booksByTitle;
	}

	@Override
	public List<Book> getByLesserPrice(double price) {
		List<Book> books = BookDetails.showBooks();
		List<Book> booksByLesserPrice = new ArrayList<>();
		for (Book book : booksByLesserPrice) {
			if(book.getPrice()<price) {
				booksByLesserPrice.add(book);
			}
			
		}if(booksByLesserPrice.isEmpty())
			throw new BookNotFoundException("No books available");
		return booksByLesserPrice;


	}
	public   List<Book> getByAuthCategory(String author, String category){
		List<Book> books = BookDetails.showBooks();
		List<Book> booksByAuthCategory = new ArrayList<>();
		for (Book book : booksByAuthCategory) {
			if(book.getAuthor().equals(author)) {
				booksByAuthCategory.add(book);
			}
			
		}if(booksByAuthCategory.isEmpty())
			throw new BookNotFoundException("No books available");
		return booksByAuthCategory;


	}

}
