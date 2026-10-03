package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
	
	public static List<Book> showBooks(){
	return	Arrays.asList(new Book("Java in Actiommn",1,"Stephen","Tech",1200),
				      new Book("JavaScript for beginners",2,"Kathy","Tech",920),
				      new Book("Palcebo",3,"Joe","Selfhelp",850),
				      new Book("Head First Java",4,"Jacbo","Tech",1100),
				      new Book("Conversations",5,"Joe","Selfhelp",1000),
				      new Book("Mind Matters",6,"Joe","Selfhelp",650)
							);
	}

}
