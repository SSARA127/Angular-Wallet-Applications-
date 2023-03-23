package com.walletapp;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
@Entity
public class Users {
    @Id
    @GeneratedValue
    Integer id;
    String name;
    //@Transient
    String email;
    @JsonIgnore
    String password;
    @Transient
    String jwt;
    Double amount;

    public Users() {

    }

    public Users(Integer id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }


    public Users(Integer id, String name, String email, String password, String jwt,Double amount) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.jwt = jwt;
        this.amount=amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


