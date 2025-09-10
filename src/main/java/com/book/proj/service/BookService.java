package com.book.proj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.proj.model.Book;
import com.book.proj.repository.BookRepository;

@Service //it shows that this class contains business logic
public class BookService {
	
	@Autowired //dependencyinjection: indicating that ,inject JPA repository here
	
	private BookRepository bookRepository;
	
	//1.Create:adding new book
	
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}
	
	//2.Read:reading all books
	
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	
	//3.Read:reading particular book by its id
	
	public Optional<Book> getBookById(Long id){
		return bookRepository.findById(id);
	}
	
	//4.update:updating existing book
	
	public Book updateBook(Book book) {
		return bookRepository.save(book); //save is also responsible to update in case of existing object
	}
	
	//5.delete:deleting book by its id
	
	public void deleteBookById(Long id) {
		bookRepository.deleteById(id);
	}
	
}
