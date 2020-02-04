package com.books.bookapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.books.bookapi.exception.BookNotFoundException;
import com.books.bookapi.model.Book;
import com.books.bookapi.repository.BookRepository;

@RestController
public class BookController {
	@Autowired
	BookRepository bookRepository;

	@RequestMapping("/")
	public String helloWorld() {
		return "Hello World";
	}

	// Get all books
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	// Create a new book
	@PostMapping("/books")
	public Book createBook(@Valid @RequestBody Book book){
		return bookRepository.save(book);
	}

	// Update a new book
	@PutMapping("/books/{id}")
	public Book updateBook(@PathVariable (value = "id") Long bookId, @Valid @RequestBody Book bookData) throws BookNotFoundException {
		Book book = bookRepository.findById(bookId).orElseThrow(() -> new BookNotFoundException(bookId));
		// now we update the book
		book.setTitle(bookData.getTitle());
		book.setIsbn(bookData.getIsbn());
		book.setAuthor(bookData.getAuthor());
		
		Book bookUpdated = bookRepository.save(book); 
		return bookUpdated;
	}
	
	// Get a book
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable (value = "id") Long bookId) throws BookNotFoundException {
		Book book = bookRepository.findById(bookId).orElseThrow(() -> new BookNotFoundException(bookId));
		return book;
	}
}
