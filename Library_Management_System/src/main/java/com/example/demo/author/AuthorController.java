package com.example.demo.author;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController 
{
	@Autowired
	private AuthorService authorService;
	
	//GET
	@RequestMapping(value = "/authors")
	public List<Author> getAuthors()
	{
		return authorService.getAllTheAuthors();	
	}
	
	//GET
	@RequestMapping(value = "/authors/{id}")
	public Author getAuthorById(@PathVariable int id)
	{
		return authorService.getAuthor(id);
	}
	
	//POST -->SAve the data
	@RequestMapping(value="/author", method = RequestMethod.POST)
	public void saveAuthor(@RequestBody Author author)
	{
		authorService.saveAuthor(author);
	}
	
	//PUT
	@RequestMapping(value="/authors/1", method = RequestMethod.PUT)
	public void updateAuthor(@RequestBody Author author)
	{
		authorService.updateAuthor(author);
	}
	
	//DELETE
	@RequestMapping(value="authors/{id}", method = RequestMethod.DELETE)
	public void deleteAuthor(int id)
	{
		authorService.deleteAuthor(id);
	}
	
	}

