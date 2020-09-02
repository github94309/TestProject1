package com.example.demo.author;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService
{
	@Autowired
	private AuthorRepository authorRepository;
	
	
	//Return ALL the authors
	public List<Author> getAllTheAuthors()
	{
		List<Author> authorList = new ArrayList<>();
		authorRepository.findAll().forEach(authorList::add);
		return authorList;
	}
	
	//Return Single Author
	public Author getAuthor(int id)
	{
		Optional<Author> optionalAuthor = authorRepository.findById(id);
		if(optionalAuthor.isPresent())
		{
			return optionalAuthor.get();
		}
		return null;
	}
	
	//Save the Author
	public void saveAuthor(Author author)
	{
		authorRepository.save(author);
	}
	
	//update the author
	public void updateAuthor(Author author)
	{
		authorRepository.save(author);
	}
	
	//Remove the author
	public void deleteAuthor(int id)
	{
		authorRepository.deleteById(id);
	}
	
}