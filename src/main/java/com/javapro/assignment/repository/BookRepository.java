package com.javapro.assignment.repository;

import com.javapro.assignment.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
