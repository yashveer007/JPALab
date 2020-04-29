package com.capg.services;

import com.capg.dao.AuthorDaoImp;
import com.capg.entities.Author;

public class AuthorServiceImpl implements IAuthorService{
	
	AuthorDaoImp authorDao = new AuthorDaoImp();
	public String addAuthor(Author author) {
		String result= authorDao.addAuthor(author);
		return result;
		
	}

	public String updateAuthor(Author author) {
		String result= authorDao.updateAuthor(author);
		return result;
		
	}

	public String deleteAuthor(int authorId) {
		String result= authorDao.deleteAuthor(authorId);
		return result;
		
	}

	public Author fetch(int authorId) {
		return authorDao.fetch(authorId);
	}

}
