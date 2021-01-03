package com.mapsa.dao;

import com.mapsa.model.Book;
import com.mapsa.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class BookDAOImpl implements BookDAO {
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public List<Book> findAllBooks() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Book");
        List<Book> books = query.list();
        session.flush();
        return books;
    }



    @Override
    public Book getBookByBookname(String bookName) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Book b WHERE b.bookName  = :bookName");
        query.setParameter("bookName",bookName);
        session.flush();
        return (Book) query.uniqueResult();

    }

    @Override
    public Person getBookById(int id) {
        return null;
    }

    @Override
    public void insertBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.save(book);
        session.flush();
    }

    @Override
    public void updateBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.update(book);
        session.flush();
    }

    @Override
    public void deleteBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(book);
        session.flush();
    }
}

