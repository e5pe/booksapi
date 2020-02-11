package com.books.bookapi.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "books")
@Setter
@Getter
@ToString
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String title;
	
	private String description;
	private String author;
	private String isbn;
	
	@Column(name = "unit_price")
	private BigDecimal unitPrice;
	
	@Column(name = "units_stock")
	private int unitsStock;
	
	@Column(name = "image_url")
	private String imageUrl;
	private boolean active;
	
	@Column(name = "date_created")
	private Date dateCreated;
	
	@Column(name = "date_updated")
	private Date dateUpdated;
	
	@ManyToOne
	@JoinColumn(name="category_id",nullable=false)
	private BookCategory category;
	
	
	public Book() {
		super();
	}
	public Book(Long id, String title, String author, String isbn) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	
	
	
	
}
