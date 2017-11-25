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

	public Books getByISBN(int ISBN)
	{
		String q = "SELECT u FROM Books u WHERE u.isbn = " + ISBN;
		TypedQuery<Books> typedQuery = em.createQuery(q, Books.class);
		return typedQuery.getSingleResult();
	 }

	public void update(Books book) 
	{
		em.getTransaction().begin();
		em.persist(book);
		em.getTransaction().commit();
	} 
	
}
