package edu.dmacc.books.books.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import edu.dmacc.books.books.data.Books;

@Component
public class BooksDao {
	
	 @PersistenceContext EntityManager em;
		
	public Books create(Books bookToAdd){
		em.getTransaction().begin();
		em.persist(bookToAdd);
		em.getTransaction().commit();
		return bookToAdd;
    }
	
	public List<Books> getAllBooks() {
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

	public Books getById(int ID)
	{
		String q = "select u from Books u WHERE id =: id";
		TypedQuery<Books> typedQuery = em.createQuery(q, Books.class);
	    return typedQuery.setParameter("id", ID).getSingleResult();
	 }

	public void update(Books book) 
	{
		em.persist(book);
	}

	public void save(Books bookToUpdate) {
		em.persist(bookToUpdate);	    
	} 
  
	

}
