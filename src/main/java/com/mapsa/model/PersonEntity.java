package com.mapsa.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PERSON", schema = "SARA", catalog = "")
public class PersonEntity {
    private int id;
    private String codemeli;
    private String firstname;
    private String lastname;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CODEMELI")
    public String getCodemeli() {
        return codemeli;
    }

    public void setCodemeli(String codemeli) {
        this.codemeli = codemeli;
    }

    @Basic
    @Column(name = "FIRSTNAME")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "LASTNAME")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonEntity that = (PersonEntity) o;
        return id == that.id &&
                Objects.equals(codemeli, that.codemeli) &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codemeli, firstname, lastname);
    }
}
