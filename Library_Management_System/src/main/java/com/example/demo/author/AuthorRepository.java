package com.example.demo.author;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer>
{

}

