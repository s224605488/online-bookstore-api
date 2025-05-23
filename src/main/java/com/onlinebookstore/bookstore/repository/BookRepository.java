package com.onlinebookstore.bookstore.repository;

import com.onlinebookstore.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
