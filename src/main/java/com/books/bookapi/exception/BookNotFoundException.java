package com.books.bookapi.exception;

public class BookNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7105097895794599133L;
	private Long book_id;

	public BookNotFoundException(Long book_id) {
		super(String.format("Book is not found with id : '%s'", book_id));
	}

}
