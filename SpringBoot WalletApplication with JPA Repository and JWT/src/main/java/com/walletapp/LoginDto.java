package com.walletapp;

public class LoginDto {

    Integer id;
    String password;
    String username;
    String email;

    public LoginDto() {
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public LoginDto(Integer id, String password) {
        this.id = id;
        this.password = password;
    }

    public LoginDto(Integer id, String password, String username) {
        this.id = id;
        this.password = password;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setId(Integer id){this.id=id;}
    public Integer getId(){
        return this.id;
    }
}
