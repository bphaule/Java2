/**
 * 
 */
package edu.dmacc.books.search.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import edu.dmacc.books.books.data.Books;

/**
 * @author MatthewsLaptop
 *
 */
@Component
public class SearchDao {
	@PersistenceContext EntityManager em;
	/*
	 * public List<Books> getAllBooks() {
		String q = "select u from Books u";
		TypedQuery<Books> typedQuery = em.createQuery(q, Books.class);
		List<Books> all = typedQuery.getResultList();
		return all;
	}
	 */
	public ArrayList<Books> getBooksByISBN(String isbn)
	{
		em.createStoredProcedureQuery(isbn);
		return null;
	}
	/**
	 * @return the entity manager
	 */
	public EntityManager getEm() {
		return em;
	}
	
}
