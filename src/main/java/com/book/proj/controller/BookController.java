package com.book.proj.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.proj.model.Book;
import com.book.proj.service.BookService;

@RestController//it shows that this class will handle web requests
@RequestMapping("/api/books")//it shows that all
//urls will be under :http://localhost:port/api/books/....
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	//Post request:http://localhost:port/api/books
	@PostMapping
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}
	
	//Get request: http://localhost:port/api/books
	@GetMapping
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	//Get request:http://localhost:port/api/books/1
	@GetMapping("/{id}")
	public Optional <Book> getBookById(@PathVariable Long id){
		return bookService.getBookById(id);
	}
	
	//Put request:http:http://localhost:port/api/books
	@PutMapping
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}
	
	//Delete request:http://localhost:port/api/books/1
	@DeleteMapping("/{id}")
	public void deleteBookById(@PathVariable Long id) {
	    bookService.deleteBookById(id);
	}

	
	
	
}
