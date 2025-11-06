package com.example.farmersMarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.farmersMarket.Model.*;

@Repository
public interface JpaUserRepository extends JpaRepository<User,String> {
    public User findByUserName(String name);
    
} 