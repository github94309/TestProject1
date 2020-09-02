package com.example.demo.author;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.book.Book;


@Entity
@Table(name = "author")
public class Author 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name= "author_Name")
	private String authorName;
	
	@ManyToOne
	@JoinColumn(name = "book_id")
	private Book book;
	
	
	public Author(int id, String authorName) 
	{
		this.id=id;
		this.authorName=authorName;
	}
	
	public Author()
	{
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	
	
	
	

}
