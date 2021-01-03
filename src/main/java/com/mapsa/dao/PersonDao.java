package com.mapsa.dao;

import com.mapsa.model.Person;

import java.util.List;

public interface PersonDao {
    List<Person> findAllPersons();
    Person getPersonById(int id);
    Person getPersonByUsername(String username);

    void insertPerson(Person person);
    void updatePerson(Person person);
    void deletePerson(Person person);
    void searchPerson(Person person);
}

