package edu.dmacc.spring.books;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.dmacc.spring.books.Books;

@Component
public class BooksDao {
	
	@Autowired EntityManager em;
		
	public void insertUser(Books userToAdd){
		em.getTransaction().begin();
		em.persist(userToAdd);
		em.getTransaction().commit();
    }
	
	public List<Books> getAllUsers() {
		String q = "select u from Books u";
		TypedQuery<Books> typedQuery = em.createQuery(q, Books.class);
		List<Books> all = typedQuery.getResultList();
		return all;
	}

	public Books getByISBN(double ISBN)
	{
		String q = "select u from Books u WHERE isbn =: isbn";
		TypedQuery<Books> typedQuery = em.createQuery(q, Books.class);
	    return typedQuery.setParameter("isbn", ISBN).getSingleResult();
	 }

	public void update(Books book) 
	{
		em.persist(book);
	} 
	
	public void mainMenu()
	{
		
	}
	
	      
	

}
