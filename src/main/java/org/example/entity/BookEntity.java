package org.example.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Book_Entity")
@Getter
@Setter
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "category")
    private String category;

    @Column(name = "author")
    private String author;

    @Column(name = "pubish_Date")
    private LocalDateTime publishDate;

    @Column(name = "available_Day")
    private LocalDateTime availableDay;

    @Column(name = "visible")
    private boolean visible;

    @Column(name = "created_Date")
    private LocalDateTime createdDate;


}
