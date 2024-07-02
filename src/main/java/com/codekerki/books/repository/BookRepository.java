package com.codekerki.books.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.codekerki.books.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    
    // Custom query
    @Query("SELECT b FROM Book b WHERE b.name LIKE :prefix%")
    List<Book> findByNamePrefix(String prefix);

}
