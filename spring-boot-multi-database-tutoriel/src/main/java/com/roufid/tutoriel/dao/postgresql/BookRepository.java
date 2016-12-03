package com.roufid.tutoriel.dao.postgresql;

import org.springframework.data.repository.CrudRepository;

import com.roufid.tutoriel.entity.postgresql.Book;

/**
 * Book repository.
 * 
 * @author Radouane ROUFID.
 *
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
