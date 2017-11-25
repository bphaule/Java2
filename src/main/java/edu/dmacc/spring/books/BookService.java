package edu.dmacc.spring.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookService {

	@Autowired BooksDao dao;
	
	public void checkIn(int isbn)
	{
		// Get the whole record from db
		// You have to store it into a Books
		Books checked = dao.getByISBN(isbn);
		
		checked.setBorrower("Available");
		
		dao.update(checked);
	}
}
