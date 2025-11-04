package com.example.farmersMarket.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 

import com.example.farmersMarket.Model.Product;
import com.example.farmersMarket.Service.JpaProductService;
import com.example.farmersMarket.Service.ProductService;

import org.apache.tomcat.util.http.parser.Authorization;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @Autowired 
    private JpaProductService jpaService;
    
    @GetMapping("/")
    public ArrayList<Product> getProducts(Authorization authentication)
    {
        System.out.println(authentication);
        return jpaService.getProducts();
    }

    @GetMapping("/{productId}")
   public Product geProduct(@PathVariable int productId)
   {
    return jpaService.getProduct(productId);
   }

   @PostMapping("/")
   public String addProduct(@RequestBody Product product)
   {
    return jpaService.addProduct(product);
   }

   @DeleteMapping("/{productId}")
   public void deleteProduct(@PathVariable int productId)
   {
    jpaService.deleteProduct(productId);
   }

   @PutMapping("/{productId}")
   public Product modifyProduct(@PathVariable int productId,@RequestBody Product product)
   {

    return jpaService.modifyProduct(productId, product);

   }

    
    
}
