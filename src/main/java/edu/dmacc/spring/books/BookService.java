package edu.dmacc.spring.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
}
