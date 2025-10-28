package com.example.farmersMarket.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.farmersMarket.Model.Product;
import com.example.farmersMarket.Repository.JpaProductRepository;
import com.example.farmersMarket.Repository.ProductRepository;

@Service
public class JpaProductService implements ProductRepository {

    @Autowired 
    private JpaProductRepository repo;

    @Override 
    public ArrayList<Product> getProducts()
    {
        List<Product> lis=repo.findAll();
        return new ArrayList(lis);

    }
    public Product getProduct(int productId)
    {
        return repo.findById(productId).orElse(null);
    }
    public String addProduct(Product product)
    {
        repo.save(product);
        return "succesfuly added";
    }
    public void deleteProduct(int productId)
    {
        repo.deleteById(productId);
    }
    public Product modifyProduct(int productId,Product product)
    {
                return repo.save(product);

    }

    
}
