package com.mapsa.controller;

import com.mapsa.dao.PersonDao;
import com.mapsa.dao.BookDAO;
import com.mapsa.model.Book;
import com.mapsa.model.Person;
import com.mapsa.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CRUDController {
    //Create, Read, Update, Delete
    private ModelAndView modelAndView = new ModelAndView();

    //  CRUD ----> Person
    @Autowired
    PersonDao personDao;
    @Autowired
    BookDAO bookDAO;

    //person list
    //read
    @GetMapping("/personlist")
    public ModelAndView showPersonList() {
        personDao.findAllPersons();
        List<Person> personList = personDao.findAllPersons();
        ModelAndView modelAndView = new ModelAndView("person");
        modelAndView.setViewName("person");
        modelAndView.addObject("persons", personList);
        return modelAndView;
    }

    @GetMapping("/booklist")
    public ModelAndView showBookList() {
        bookDAO.findAllBooks();
        List<Book> bookList = bookDAO.findAllBooks();
        ModelAndView modelAndView = new ModelAndView("book");
        modelAndView.setViewName("book");
        modelAndView.addObject("books", bookList);
        return modelAndView;
    }


    //delete
    @GetMapping("/deleteperson")
    public String deleteperson() {
        return "delete";
    }

    @PostMapping("/deleteperson")
    public ModelAndView deletePerson(@RequestParam("firstName") String firstName) {
        Person personByUsername = personDao.getPersonByUsername(firstName);
        if (personByUsername != null) {
            personDao.deletePerson(personByUsername);
            modelAndView.setViewName("message");
            modelAndView.addObject("msg", "X Deleted X");
        } else {
            modelAndView.addObject("msg", "User not found!");
        }
        return modelAndView;
    }

    @GetMapping("/deletebook")
    public String deleteBook() {
        return "deleteb";
    }

    @PostMapping("/deletebook")
    public ModelAndView deleteBook(@RequestParam("bookName") String bookName) {
        Book bookByBookname = bookDAO.getBookByBookname(bookName);
        if (bookByBookname != null) {
            bookDAO.deleteBook(bookByBookname);
            modelAndView.setViewName("message");
            modelAndView.addObject("msg", "X Deleted X");
        } else {
            modelAndView.addObject("msg", "book not found!");
        }
        return modelAndView;
    }

    //insert
    @GetMapping("/insertperson")
    public String insertPerson() {
        return "insertperson";
    }

    @PostMapping("/insertperson")
    public ModelAndView insertPerson(@RequestParam("firstName") String firstName,
                                     @RequestParam("lastName") String lastName,
                                     @RequestParam("codeMeli") String codeMeli
    ) {
        modelAndView.setViewName("message");
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setCodeMeli(codeMeli);
        personDao.insertPerson(person);
        modelAndView.addObject("msg", "* insert shod *");

        return modelAndView;
    }

    @GetMapping("/insertbook")
    public String insertBook() {
        return "insertbook";
    }

    @PostMapping("/insertbook")
    public ModelAndView insertBook(@RequestParam("bookName") String bookName,
                                     @RequestParam("isbn") String isbn,
                                     @RequestParam("author") String author
    ) {
        modelAndView.setViewName("message");
        Book book = new Book();
        book.setBookName(bookName);
        book.setIsbn(isbn);
        book.setAuthor(author);
        bookDAO.insertBook(book);
        ModelAndView mv = new ModelAndView();

        mv.setViewName("message");
        mv.addObject("msg", "insert anjamshod");
        return modelAndView;
    }

        //update
    @GetMapping("/updateperson")
    public String updatePerson() {
        return "update";
    }

    @PostMapping("/updateperson")
    public ModelAndView updatePerson(@RequestParam("firstName") String firstName,
                                     @RequestParam("lastName") String lastName,
                                     @RequestParam("codeMeli") String codeMeli
    ) {
        modelAndView.setViewName("message");
        Person personByfirstName = personDao.getPersonByUsername(firstName);
        if (personByfirstName != null) {
            personByfirstName.setFirstName(firstName);
            personByfirstName.setLastName(lastName);
            personByfirstName.setCodeMeli(codeMeli);
            personDao.updatePerson(personByfirstName);
            modelAndView.addObject("msg", "* updated *");
        } else {
            modelAndView.addObject("msg", "User not found!");
        }
        return modelAndView;
    }
    @GetMapping("/updatebook")
    public String updatebook() {
        return "updatebook";
    }

    @PostMapping("/updatebook")
    public ModelAndView updateBook(@RequestParam("bookName") String bookName,
                                     @RequestParam("author") String author,
                                     @RequestParam("isbn") String isbn
    ) {
        modelAndView.setViewName("message");
        Book bookByBookName=bookDAO.getBookByBookname(bookName);

        if (bookByBookName != null) {
            bookByBookName.setBookName(bookName);
            bookByBookName.setAuthor(author);
            bookByBookName.setIsbn(isbn);
            bookDAO.updateBook(bookByBookName);
            modelAndView.addObject("msg", "* updated *");
        } else {
            modelAndView.addObject("msg", "book not found!");
        }
        return modelAndView;
    }

}
