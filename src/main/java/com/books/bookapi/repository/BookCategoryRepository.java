package com.books.bookapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.books.bookapi.model.BookCategory; 

@Repository
@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "bookCategory", path = "bookCategory")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
