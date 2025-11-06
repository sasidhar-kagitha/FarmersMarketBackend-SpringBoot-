package com.example.farmersMarket.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.farmersMarket.Service.JpaUserService;
import com.example.farmersMarket.Service.UserService;

import java.util.*;
import com.example.farmersMarket.Model.User;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService service;

    @Autowired 
    private JpaUserService jpaService;

    @GetMapping("/users")
    public ArrayList<User> getUsers()
    {
        return jpaService.getUsers();
    }

    @PostMapping("auth/login")
    public ResponseEntity<String> userLogin(@RequestBody User user)
    {
        return jpaService.userLogin(user);
    }

    @PostMapping("auth/register")
    public String userSignUp(@RequestBody User user) {
        //TODO: process POST request
        
        return "User registered successfully";
    }
    



    
}
