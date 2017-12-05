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
public class SearchService {
	
	@Autowired BooksDao dao;
	/*
	 * 1 = Title
             	2 = Author
             	3 = ISBN
             	4 = Copyright year
	 */
	
	public ArrayList<Books> GetTextSearch(String searchText, int SearchType)
	{
		
	}
	
	public ArrayList<Books>
	/**
	 * Calls the specific function needed to search for a book
	 * @param searchText
	 * @param searchType
	 * @return
	 */
	public ArrayList<Books> getBook(
			String searchText, int searchType) {
		//see what search type
		
		return null;
	}
	
}
