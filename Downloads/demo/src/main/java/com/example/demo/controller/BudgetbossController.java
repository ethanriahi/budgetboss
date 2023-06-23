package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.BudgetbossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
@RestController
@CrossOrigin("*")
@RequestMapping("/")
public class BudgetbossController {

      @Autowired
      BudgetbossService budgetbossService;

        @RequestMapping(method = RequestMethod.POST,  value = "/adduser")
        public void addUser(@RequestBody User user) throws IOException {
            budgetbossService.addUser(user);
        }
}
