package edu.dmacc.books.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.dmacc.books.books.dao.BooksDao;
import edu.dmacc.books.books.data.Books;

@Component
public class BookService {

	@Autowired BooksDao dao;
	
	public void checkIn(String isbn)
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
	
	public List<Books> getAllBooks() {
		
		List<Books> b = dao.getAllBooks();
		return b;
		
	}
	
	public List<Books> getOutBooks(){
		
		List<Books> b = dao.getOutBooks();
		return b;
		
	}
	
	public List<Books> getAvailableBooks(){
		
		List<Books> b = dao.getAvailableBooks();
		return b;
		
	}
}
