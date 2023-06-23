package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.BudgetbossRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class BudgetbossService {

    @Autowired
    BudgetbossRepository budgetbossRepository;
    public void addUser(User user) {
        budgetbossRepository.addUser(user);
    }
}
