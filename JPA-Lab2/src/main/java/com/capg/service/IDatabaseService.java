package com.capg.service;

import java.util.List;

import com.capg.entities.Author;
import com.capg.entities.Book;

public interface IDatabaseService {

	public void putAuthor(Author a);
	public List<Author> getAllAuthor();
	public void putBook(Book b);
	public List<Book> getAllBooks();
	public List<Book> getByPrice(int min, int max);
	public Book getBook(int bid);
}
