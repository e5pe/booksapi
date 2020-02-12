package com.books.bookapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.books.bookapi.model.Book; 

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface BookRepository extends JpaRepository<Book, Long>{

}
