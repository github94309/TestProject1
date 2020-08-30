package com.example.demo.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController 
{
	@Autowired
	private BookService bookService;
	
	//GET
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public List<Book> getBooks()
	{
		return bookService.getAllTheBooks();
	}
	
	//GET
	@RequestMapping(value="/books/{id}", method = RequestMethod.GET)
	public Book getBookById(@PathVariable int id)
	{
		return bookService.getBook(id);
	}
	
	//POST
	@RequestMapping(value="/book", method = RequestMethod.POST)
	public void saveBook(@RequestBody Book book)
	{
		bookService.saveBook(book);
	}
	
	//PUT
	@RequestMapping(value="/books/1", method = RequestMethod.PUT)
	public void updateBook(@RequestBody Book book)
	{
		bookService.updateBook(book);
	}
	
	//DELETE
	@RequestMapping(value="/books", method = RequestMethod.DELETE)
	public void deleteBook(int id)
	{
		bookService.deleteBook(id);
	}
	

}
