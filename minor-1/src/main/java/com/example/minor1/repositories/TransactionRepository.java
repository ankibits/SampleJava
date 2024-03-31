package com.example.minor1.repositories;

import com.example.minor1.models.Book;
import com.example.minor1.models.Student;
import com.example.minor1.models.Transaction;
import com.example.minor1.models.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    //@Query("select * from transaction where student_id = ?1 and book_id = ?2 and transactionType = ?3 order by id desc limit 1")
    Transaction findTopByStudentAndBookAndTransactionTypeOrderByIdDesc(Student student, Book book, TransactionType transactionType);
}
