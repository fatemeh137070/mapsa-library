package com.mapsa.dao;

import com.mapsa.model.Book;
import com.mapsa.model.Person;

import java.util.List;

public interface BookDAO {
    List<Book> findAllBooks();
   // Book getBookById(int id);
    Book getBookByBookname(String bookName);
    Person getBookById(int id);

    void insertBook(Book book);
    void updateBook(Book book);
    void deleteBook(Book book);

}

