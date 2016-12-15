package com.roufid.tutorial.repository;

import org.springframework.data.repository.CrudRepository;

import com.roufid.tutorial.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

}