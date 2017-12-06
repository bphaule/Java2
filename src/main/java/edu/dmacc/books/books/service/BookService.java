package edu.dmacc.books.books.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.dmacc.books.books.dao.BooksDao;
import edu.dmacc.books.books.data.Books;

@Component
public class BookService {

	@Autowired BooksDao dao;
	
	public void checkIn(double isbn)
	{
		// Get the whole record from db
		// You have to store it into a Books
		// uncomment Books checked = dao.getByISBN(isbn);
		
		// uncomment checked.setBorrower(0);
		
		// uncomment dao.update(checked);
	}

	public Books add(Books books) {
		if(books == null)
			return null;
	
		books = dao.create(books);
		return books;
	}
}
