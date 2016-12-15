package com.roufid.tutorial.repository;

import org.springframework.data.repository.CrudRepository;

import com.roufid.tutorial.domain.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
