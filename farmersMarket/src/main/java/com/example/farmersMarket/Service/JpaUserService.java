package com.example.farmersMarket.Service;

import com.example.farmersMarket.Repository.JpaUserRepository;
import com.example.farmersMarket.Repository.UserRepository;
import com.example.farmersMarket.Model.*;



import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class JpaUserService implements UserRepository
{

    @Autowired 
    JpaUserRepository repo;
    @Autowired
    BCryptPasswordEncoder bycrypt;
    
    @Override 
    public ArrayList<User> getUsers()
    {
        return new ArrayList<>(repo.findAll()); 
    }
    @Override 
    public ResponseEntity<String> userLogin(User user)
    {
        User existingUser=repo.findByUserName(user.getUserName());
        System.out.println(existingUser.toString());
        if(existingUser==null)
           return new ResponseEntity<>("User not found",HttpStatus.NOT_FOUND);
        if(bycrypt.matches(user.getPassword(),existingUser.getPassword()))
        {
            return new ResponseEntity<>("Valid user, sorry for inconvienece",HttpStatus.OK);
        }
       //new ResponseStatusException(HttpStatus.UNAUTHORIZED,"Valid user, sorry for inconvienece");

        
       return new ResponseEntity<>("Invalid password",HttpStatus.UNAUTHORIZED);
    }
}

