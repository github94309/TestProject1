package com.example.demo.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService 
{
	@Autowired
	private BookRepository bookRepository;
	
	//Return All the books
	public List<Book> getAllTheBooks() 
	{
		List<Book> bookList = new ArrayList<>();
		bookRepository.findAll().forEach(bookList::add);
		return bookList;
	}
	
	//return Single book
	public Book getBook(int id)
	{
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent())
		{
				return optionalBook.get();
		}
		return null;
	}
	
	//Save the book
	public void saveBook(Book book)
	{
		bookRepository.save(book);
	}
	
	//update the book
	public void updateBook(Book book)
	{
		bookRepository.save(book);
	}
	
	//Remove the book
	public void deleteBook(int id)
	{
		bookRepository.deleteById(id);
	}
	

}
