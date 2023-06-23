package org.example.service;

import org.example.entity.BookEntity;
import org.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<BookEntity> getBookList(){
        List<BookEntity> bookList = bookRepository.getBookList;
        return bookList;
    }

//    public List<BookEntity> search(){
//
//    }



}
