package com.example.farmersMarket.Repository;


import java.util.*;

import com.example.farmersMarket.Model.Product;

public interface ProductRepository {
    
    public ArrayList<Product> getProducts();
    public Product getProduct(int productId);
    public String addProduct(Product product);
    public void deleteProduct(int productId);
    public Product modifyProduct(int productId,Product product);
    
}
