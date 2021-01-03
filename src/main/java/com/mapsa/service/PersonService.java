package com.mapsa.service;

import com.mapsa.dao.PersonDao;
import com.mapsa.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
@Autowired
private PersonDao personDao;
public  void insert(String firstName,String lastName,String codeMeli){
    Person person=new Person();
person.setFirstName(firstName);
person.setLastName(lastName);
person.setCodeMeli(codeMeli);
personDao.insertPerson(person);
}
public  void search(String firstName ){
    Person person=new Person();
    person.setFirstName(firstName);
}
}
