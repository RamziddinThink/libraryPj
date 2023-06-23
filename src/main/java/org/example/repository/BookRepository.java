package org.example.repository;

import org.example.dto.BookDto;
import org.example.entity.BookEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class BookRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public List<BookEntity> getBookList{
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select id, title, category, author from BookEntity");

    }


}
