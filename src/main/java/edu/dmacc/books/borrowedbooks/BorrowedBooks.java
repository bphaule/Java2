/**
 * 
 */
package edu.dmacc.books.borrowedbooks;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.eclipse.persistence.jpa.jpql.parser.DateTime;


/**
 * @author MatthewsLaptop
 *
 */
@Entity
@Table(name="borrowedbooks")
public class BorrowedBooks {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idBorrowedBooks;
	private int bookID;
	private int borrowerID;
	private int checkedOut;
	private int checkedIn;
	
	
	/**
	 * @param bookID
	 * @param borrowerID
	 */
	public BorrowedBooks(int bookID, int borrowerID) {
		this.bookID = bookID;
		this.borrowerID = borrowerID;
	}

	/**
	 * @param id
	 * @param bookID
	 * @param borrowerID
	 * @param checkedOut
	 */
	public BorrowedBooks(int id, int bookID, int borrowerID) {
		this.idBorrowedBooks = id;
		this.bookID = bookID;
		this.borrowerID = borrowerID;
//		this.checkedOut = checkedOut;
	}
	/**
	 * 
	 */
	public BorrowedBooks() {
	}
	
	/**
	
 * @return the id
	 */
	public int getId() {
		return idBorrowedBooks;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.idBorrowedBooks = id;
	}
	/**
	 * @return the bookID
	 */
	public int getBookID() {
		return bookID;
	}
	/**
	 * @param bookID the bookID to set
	 */
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	/**
	 * @return the borrowerID
	 */
	public int getBorrowerID() {
		return borrowerID;
	}
	/**
	 * @param borrowerID the borrowerID to set
	 */
	public void setBorrowerID(int borrowerID) {
		this.borrowerID = borrowerID;
	}
	/**
//	 * @return the checkedOut
//	 */
	public int getCheckedOut() {
		return checkedOut;
	}
	/**
//	 * @param checkedOut the checkedOut to set
//	 */
	public void setCheckedOut(int checkedOut) {
		this.checkedOut = checkedOut;
	}
	/**
//	 * @return the checkedIn
//	 */
	public int getCheckedIn() {
		return checkedIn;
	}
	/**
//	 * @param checkedIn the checkedIn to set
//	 */
	public void setCheckedIn(int checkedIn) {
		this.checkedIn = checkedIn;
	}

}
