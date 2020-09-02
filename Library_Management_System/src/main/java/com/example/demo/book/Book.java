package com.example.demo.book;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.author.Author;

@Entity
@Table(name= "book")
public class Book 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "author")
	private String author;
	@Column(name = "price")
	private double price;
	
	@OneToMany(mappedBy  = "author",fetch = FetchType.EAGER)
	private List<Author> authors = new ArrayList<>();
	
	
	public Book(int id, String name, String author, double price) 
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.price=price;
	}
	
	public Book() 
	{
		
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}
}
	
	
	