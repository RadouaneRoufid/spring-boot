package com.roufid.tutorial;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.roufid.tutorial.dao.mysql.AuthorRepository;
import com.roufid.tutorial.dao.postgresql.BookRepository;
import com.roufid.tutorial.entity.mysql.Author;
import com.roufid.tutorial.entity.postgresql.Book;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

	@Autowired
	private AuthorRepository authorRepository;

	@Autowired
	private BookRepository bookRepository;

	private Long bookId = 1L;
	
	/**
	 * Will be executed before the methods annotated with code @Test.
	 */
	@Before
	public void init() {

		Author author = new Author();
		author.setId(1L);
		author.setFirstname("Radouane");
		author.setLastname("Roufid");

		authorRepository.save(author);

		Book book = new Book();
		book.setId(bookId);
		book.setName("Spring Boot Book");
		book.setAuthorId(author.getId());

		bookRepository.save(book);
	}

	/**
	 * Test should find the author's book from the PostgreSQL database.
	 */
	@Test
	public void testShouldFindAuthor() {
		
		Book book = bookRepository.findOne(bookId);
		
		Assert.assertNotNull(book);
		
		Author author = authorRepository.findOne(book.getId());
		
		Assert.assertNotNull(author);
		
		System.out.println("The book " + book.getName() + " was written by " + author.getFirstname() + " " + author.getLastname());
		
	}

}
