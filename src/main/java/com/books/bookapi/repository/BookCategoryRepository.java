package com.books.bookapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.books.bookapi.model.BookCategory; 

@Repository
@RepositoryRestResource(collectionResourceRel = "bookCategory", path = "bookCategory")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
