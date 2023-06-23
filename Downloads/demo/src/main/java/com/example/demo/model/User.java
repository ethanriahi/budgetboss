package com.example.demo.model;

import java.time.LocalDate;

public class User {
    String identity;
    String mailAdress;
    String numberPhone;
    LocalDate dateOfBirth;
    String username;
    String password;
    String role;
    Integer idUser;

    public User() {
    }

    public User(String identity, String mailAdress, String numberPhone, LocalDate dateOfBirth, String username, String password, String role, Integer idUser) {
        this(username, password, role);
        this.identity = identity;
        this.mailAdress = mailAdress;
        this.numberPhone = numberPhone;
        this.dateOfBirth = dateOfBirth;
        this.idUser = idUser;
    }

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getMailAdress() {
        return mailAdress;
    }

    public void setMailAdress(String mailAdress) {
        this.mailAdress = mailAdress;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "identity='" + identity + '\'' +
                ", mailAdress='" + mailAdress + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", idUser=" + idUser +
                '}';
    }
}
