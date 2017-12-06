/**
 * 
 */
package edu.dmacc.books.search.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.eclipse.persistence.internal.libraries.asm.tree.TryCatchBlockNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.dmacc.books.books.dao.BooksDao;
import edu.dmacc.books.books.data.Books;
import edu.dmacc.books.search.dao.SearchDao;

/**
 * @author MatthewsLaptop
 *
 */
@Component
public class SearchService {
	
	@Autowired SearchDao dao;
	
	
	public List<Books> SearchBooks(String searchText, int searchType)
	{
		StoredProcedureQuery query  = dao.getEm().createNamedStoredProcedureQuery("SearchBooks");
			query.setParameter("searchType", searchType);
			query.setParameter("searchText", searchText);
			query.setParameter("searchNum", 0);
			
			@SuppressWarnings("unchecked")
			List<Books> results = query.getResultList();
			
		return results;
	}
	
	public List<Books> SearchBooks(int searchNum, int searchType)
	{
		System.out.println("In Search Books Num");
		StoredProcedureQuery query  = dao.getEm().createNamedStoredProcedureQuery("SearchBooks");
		query.setParameter("searchType", searchType);
		query.setParameter("searchText", "");
		query.setParameter("searchNum", searchNum);
		
		@SuppressWarnings("unchecked")
		List<Books> results = query.getResultList();
		
	return results;
	}
	/*
	 * 1 = Title
             	2 = Author
             	3 = ISBN
             	4 = Copyright year
	 */
	/**
	 * Calls the specific function needed to search for a book
	 * @param searchText - the text the user entered
	 * @param searchType - The column to perform the search on
	 * @return - List of books that match search parameters
	 */
	public List<Books> getBook(
			String searchText, int searchType) 
	{
		List<Books> bookList = new ArrayList<Books>();
		//see what search type
		if(searchType == 1 || searchType ==2) //title
		{
			bookList =SearchBooks(searchText, searchType);
		}
		if(searchType == 3 || searchType ==4)
		{
			int searchNum =0;
			try {
				 searchNum = Integer.parseInt(searchText);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bookList =SearchBooks(searchNum, searchType);
		}
		
		return bookList;
	}
	
}
