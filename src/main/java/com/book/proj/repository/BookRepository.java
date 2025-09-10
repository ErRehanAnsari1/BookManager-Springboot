package com.book.proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.proj.model.Book;

@Repository//this indicates that this class handles db ops

//JpaRepository<Entityname,Entiti's primary key datatype>
public interface BookRepository extends JpaRepository<Book,Long> {

	//we get some methods by extending this interface,
	//which are useful like save(),findAll(),findById(),
	//deleteById(),etc.
}
