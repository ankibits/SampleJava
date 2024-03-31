package com.example.minor1.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Enumerated
    private Genre genre; // HISTORY => HISTORY

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;


    @JoinColumn
    @ManyToOne
    @JsonIgnoreProperties({"bookList"})
    private Author my_author;


    @JoinColumn
    @ManyToOne
    @JsonIgnoreProperties({"bookList"})
    private Student student;

    @OneToMany(mappedBy = "book")
    @JsonIgnoreProperties({"bookList"})
    private List<Transaction> transactionList;


}
