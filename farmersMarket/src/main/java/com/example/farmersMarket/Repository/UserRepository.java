package com.example.farmersMarket.Repository;

import java.util.*;

import org.springframework.http.ResponseEntity;

import com.example.farmersMarket.Model.User;

public interface UserRepository {

     public  ArrayList<User> getUsers();
     public ResponseEntity<String> userLogin(User user);
   //  public String userLogin(User user);
}
