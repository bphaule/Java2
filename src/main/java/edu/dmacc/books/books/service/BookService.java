package edu.dmacc.books.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.dmacc.books.books.dao.BooksDao;
import edu.dmacc.books.books.data.Books;
import edu.dmacc.books.borrowedbooks.BorrowedBooksDao;
import edu.dmacc.books.borrower.data.Borrower;

@Component
public class BookService {

	@Autowired BooksDao dao;
	@Autowired BorrowedBooksDao bdao;
	
	public void checkIn(int borrowerID, int bookID)
	{
		// Get the whole record from db
		// You have to store it into a Books
		Books b = dao.getById(bookID);
		b.addQuantity(1);
		dao.update(b);
		bdao.removeBorrowedBook(borrowerID, bookID);
		
	}

	public Books add(Books books) {
		if(books == null)
			return null;
	
		books = dao.create(books);
		return books;
	}
	
	public List<Books> getAllBooks(){
		
		List<Books> allBooks = dao.getAllBooks();
		return allBooks;
		
	}
	
	public List<Borrower> getAllBorrowers(){
		
		List<Borrower> borrowers = dao.getAllBorrowers();
		return borrowers;
		
	}
	
}
