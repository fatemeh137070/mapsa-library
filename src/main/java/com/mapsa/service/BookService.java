package com.mapsa.service;

import com.mapsa.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        Book book1 = new Book();
        book1.setId(123);
        book1.setAuthor("jafari");
        book1.setBookName("c#");
        book1.setIsbn("1233");

        Book book2 = new Book();
        book2.setId(1001);
        book2.setAuthor("gholami");
        book2.setBookName("java");
        book2.setIsbn("8765");

        books.add(book1);
        books.add(book2);

        return books;
    }

}