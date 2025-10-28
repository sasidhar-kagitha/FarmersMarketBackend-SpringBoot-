package com.example.farmersMarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.farmersMarket.Model.Product;

@Repository
public interface JpaProductRepository extends JpaRepository<Product,Integer> {
    
}
