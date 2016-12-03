package com.roufid.tutoriel.dao.mysql;

import org.springframework.data.repository.CrudRepository;

import com.roufid.tutoriel.entity.mysql.Author;

/**
 * Author Repository.
 * 
 * @author Radouane ROUFID.
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
