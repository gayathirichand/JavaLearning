package com.bookapp.model;

public class Book implements Comparable<Book>{
	private String title;
	private Integer bookId;
	private String author;
	private String category;
	private double price;
	
	
	public Book(String title, Integer bookId, String author, String category, double price) {
		super();
		this.title = title;
		this.bookId = bookId;
		this.author = author;
		this.category = category;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price + ", category="
				+ category + "]";
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Book() {
		super();
	}


	@Override
	public int compareTo(Book o) {
//compare the current object title with the object in parameter
		// here let us use title
		return this.getTitle().compareTo(o.getTitle());
	}

}
