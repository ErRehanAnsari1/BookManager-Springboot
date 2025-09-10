package com.book.proj.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
@Column(nullable=false)//this column can't be null in db
	
	private String title;
	
	@Column(nullable=false)
	
	private String author;
	
	public Book() {}//default constructor(required for jpa)
	
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
	
	}
	
	//Getter and Setter Methods(must needed)
	
	public long getId() {
		return id;
	}
	public void setID(Long id) {
		this.id=id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}

}
