package com.example.library.entity;


import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToMany
    @JoinColumn(name = "book_id")
    private List<Book> book;
}
