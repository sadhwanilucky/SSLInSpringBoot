package io.codefountain.api.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Data
@Entity
public class Book {

    @Id
    private long bookId;
    private String bookTitle;
    private String bookAuthor;
    private String bookPublisher;
    
    
	public Book(long bookId, String bookTitle, String bookAuthor, String bookPublisher) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
    
    

}
