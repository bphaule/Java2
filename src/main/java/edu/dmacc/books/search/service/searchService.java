/**
 * 
 */
package edu.dmacc.books.search.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.dmacc.books.books.dao.BooksDao;
import edu.dmacc.books.books.data.Books;

/**
 * @author MatthewsLaptop
 *
 */
@Component
public class searchService {
	
	@Autowired BooksDao dao;
	/*
	 * 1 = Title
             	2 = Author
             	3 = ISBN
             	4 = Copyright year
	 */
	/**
	 * Gets the Books by the title
	 * 
	 * @param title -Title of the book
	 * @return the list of books that are the same as the title
	 */
	public ArrayList<Books> getBooksByTitle(String title)
	{
		if(title == null)
			return null;
		ArrayList<Books> books = new ArrayList<Books>();
		
		return books;
		
	}
	/**
	 * Get the books by Author
	 * @param author - Author to look up by
	 * @return the list of books with authors that match
	 */
	public ArrayList<Books> getBooksByAuthor(String author)
	{
		if(author == null)
			return null;
		ArrayList<Books> books = new ArrayList<Books>();
		
		return books;
		
	}
	/**
	 * Get books by ISBN
	 * @param isbn - the ISBN to look books up by
	 * @return the books that are similar to ISBN
	 */
	public ArrayList<Books> getBooksByISBN(String isbn)
	{
		if( isbn == null)
			return null;
		ArrayList<Books> books = new ArrayList<Books>();
		
		return books;
		
	}
	/**
	 * Look up books by copyright year
	 * @param year - year copyrighted
	 * @return the books that match the parameter
	 */
	public ArrayList<Books> getBooksByCopyrightYear(String year)
	{
		if(year == null)
			return null;
		ArrayList<Books> books = new ArrayList<Books>();
		
		return books;
		
	}
	
}
