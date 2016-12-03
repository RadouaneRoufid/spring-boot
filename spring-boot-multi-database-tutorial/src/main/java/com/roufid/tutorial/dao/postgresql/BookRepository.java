package com.roufid.tutorial.dao.postgresql;

import org.springframework.data.repository.CrudRepository;

import com.roufid.tutorial.entity.postgresql.Book;

/**
 * Book repository.
 * 
 * @author Radouane ROUFID.
 *
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
