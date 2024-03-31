package com.example.minor1.repositories;
import com.example.minor1.models.Book;
import com.example.minor1.models.Genre;

import com.example.minor1.models.Book;
import com.example.minor1.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByGenre(Genre genre);


    List<Book> findByName(String searchValue);
}
