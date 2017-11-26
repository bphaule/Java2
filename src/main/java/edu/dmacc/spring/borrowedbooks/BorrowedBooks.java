/**
 * 
 */
package edu.dmacc.spring.borrowedbooks;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.eclipse.persistence.jpa.jpql.parser.DateTime;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author MatthewsLaptop
 *
 */
@Entity
@Table(name="borrowedbooks")
public class BorrowedBooks {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int bookID;
	private int borrowerID;
	private DateTime checkedOut;
	private DateTime checkedIn;
	
	
	/**
	 * @param bookID
	 * @param borrowerID
	 */
	public BorrowedBooks(int bookID, int borrowerID) {
		this.bookID = bookID;
		this.borrowerID = borrowerID;
	}
	
	/**
	 * @param bookID
	 * @param borrowerID
	 * @param checkedOut
	 */
	public BorrowedBooks(int bookID, int borrowerID, DateTime checkedOut) {
		this.bookID = bookID;
		this.borrowerID = borrowerID;
		this.checkedOut = checkedOut;
	}
	/**
	 * @param id
	 * @param bookID
	 * @param borrowerID
	 * @param checkedOut
	 */
	public BorrowedBooks(int id, int bookID, int borrowerID, DateTime checkedOut) {
		this.id = id;
		this.bookID = bookID;
		this.borrowerID = borrowerID;
		this.checkedOut = checkedOut;
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
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the checkedOut
	 */
	public DateTime getCheckedOut() {
		return checkedOut;
	}
	/**
	 * @param checkedOut the checkedOut to set
	 */
	public void setCheckedOut(DateTime checkedOut) {
		this.checkedOut = checkedOut;
	}
	/**
	 * @return the checkedIn
	 */
	public DateTime getCheckedIn() {
		return checkedIn;
	}
	/**
	 * @param checkedIn the checkedIn to set
	 */
	public void setCheckedIn(DateTime checkedIn) {
		this.checkedIn = checkedIn;
	}

}
