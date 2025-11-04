package com.example.farmersMarket.Service;

import com.example.farmersMarket.Repository.JpaUserRepository;
import com.example.farmersMarket.Repository.UserRepository;
import com.example.farmersMarket.Model.*;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JpaUserService implements UserRepository{

    @Autowired 
    JpaUserRepository repo;
    @Override 
    public ArrayList<User> getUsers()
    {
        return new ArrayList<>(repo.findAll());
    }
    
}
