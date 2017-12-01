package edu.dmacc.books.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.dmacc.books.books.dao.BooksDao;
import edu.dmacc.books.books.data.Books;
import edu.dmacc.books.borrower.data.Borrower;

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
	
	public void checkout(Books book, Borrower borrowers){
	    // look up book from dao
		// 
		// append to list
		// set the list back
		Books bookToUpdate = dao.getById(book.getId());   // look up book from dao
		List<Borrower> borrowerToUpdate = bookToUpdate.getBorrowers();  // borrower from book object
		borrowerToUpdate.add(borrowers);
		bookToUpdate.setBorrowers(borrowerToUpdate);
		bookToUpdate.setAvailable(bookToUpdate.getAvailable() - 1);
		dao.save(bookToUpdate);

	}
}
