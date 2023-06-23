package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BudgetbossRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addUser(User user) {
        String addUserRequest = "INSERT INTO users (identity, mailAdress, numberPhone, dateOfBirth, username, password, role) VALUES(?,?,?,?,?,?,?)";
        System.out.println("addUserRequest : " + addUserRequest);
        try {
            jdbcTemplate.update(addUserRequest, user.getIdentity(), user.getMailAdress(), user.getNumberPhone(), user.getDateOfBirth(), user.getUsername(), user.getPassword(), user.getRole());
        } finally {
            System.out.println("error adding User!");
        }
    }
}
