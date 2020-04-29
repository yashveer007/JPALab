package com.capg.dao;

import com.capg.entities.Author;

public interface IAuthorDao {

	String addAuthor(Author author);
	String updateAuthor(Author author);
	String deleteAuthor(int authorId);
	Author fetch(int authorId);
}
