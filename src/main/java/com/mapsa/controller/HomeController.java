package com.mapsa.controller;

import com.mapsa.service.BookService;
import com.mapsa.dao.PersonDao;
import com.mapsa.dao.BookDAO;
import com.mapsa.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    BookService productService;
    @Autowired
    private PersonDao personDao;
    @Autowired
    private BookDAO bookDAO;

    @RequestMapping("/")
    public ModelAndView home(){
//        productDAO.findAllProducts();
//        return "index";
        List<Book> books = productService.getBooks();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("books", books);
        return modelAndView;
    }
    @RequestMapping("/book")
    public ModelAndView getBook(){
        List<Book> books = bookDAO.findAllBooks();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("books", books);
        return modelAndView;
    }
    @RequestMapping("/save")
    public String save(){
        Book book = new Book();
       book.setId(200);
        book.setAuthor("khani");
        book.setBookName("c++");
        book.setIsbn("5465");


        return "index";
    }

}

