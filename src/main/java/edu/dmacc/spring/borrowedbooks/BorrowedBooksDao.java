/**
 * 
 */
package edu.dmacc.spring.borrowedbooks;

import javax.persistence.EntityManager;

import org.eclipse.persistence.jpa.jpql.parser.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.dmacc.spring.books.Books;
import edu.dmacc.spring.borrowers.Borrower;

/**
 * @author MatthewsLaptop
 *
 */
@Component
public class BorrowedBooksDao {
	@Autowired EntityManager em;
	public boolean NewBorrowedBook(BorrowedBooks bb)
	{
		try
		{
			em.getTransaction().begin();
			em.persist(bb);
			em.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
	/***
	 * 
	 * @param book
	 * @param borrow
	 * @return true if New Borrowed book was successfully added
	 */
	public boolean NewBorrowedBook(Books book, Borrower borrow)
	{
		try
		{
			BorrowedBooks bb = new BorrowedBooks(book.getId(), borrow.getBorrowerID());
			
			em.getTransaction().begin();
			em.persist(bb);
			em.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
		
	}
	public boolean TurnInBook(BorrowedBooks bb)
	{
		try
		{
			
			//TODO: Make Sure this is right
			//I have no idea if this works
			DateTime dt = new DateTime(bb.getCheckedIn());
			dt.isCurrentTimestamp();
			bb.setCheckedIn(dt);
			bb.setCheckedIn(dt);
			em.persist(bb);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
	/**
	 * 
	 * @param book
	 * @param borrow
	 * @return true if borrowed book turned in successfully
	 */
	public boolean TurnInBook(Books book, Borrower borrow)
	{
		try
		{
			BorrowedBooks bb = new BorrowedBooks(book.getId(), borrow.getBorrowerID());
			//TODO: Make Sure this is right
			//I have no idea if this works
			DateTime dt = new DateTime(bb.getCheckedIn());
			dt.isCurrentTimestamp();
			bb.setCheckedIn(dt);
			bb.setCheckedIn(dt);
			em.persist(bb);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
