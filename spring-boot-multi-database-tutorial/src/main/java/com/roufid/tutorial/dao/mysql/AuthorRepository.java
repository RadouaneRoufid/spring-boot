package com.roufid.tutorial.dao.mysql;

import org.springframework.data.repository.CrudRepository;

import com.roufid.tutorial.entity.mysql.Author;

/**
 * Author Repository.
 * 
 * @author Radouane ROUFID.
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
