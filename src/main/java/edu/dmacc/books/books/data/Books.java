package edu.dmacc.books.books.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;


@Entity
@Table(name="books")
/*
 * Add the procedure for searching the books
 * Citation: https://www.thoughts-on-java.org/call-stored-procedures-jpa/
 */
@NamedStoredProcedureQuery(
		name = "SearchBooks",
		procedureName = "SearchBooks",
		resultClasses = Books.class,
		parameters = {
				//In params
				@StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "searchType"),
				@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "searchText"),			
				@StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "searchNum")
		}
		)

public class Books {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String author;
	private String detail;
	private String copyrightyear;
	private String isbn;
	private String country;
	private int available;
	
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getCopyrightyear() {
		return copyrightyear;
	}
	public void setCopyrightyear(String copyrightyear) {
		this.copyrightyear = copyrightyear;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	}