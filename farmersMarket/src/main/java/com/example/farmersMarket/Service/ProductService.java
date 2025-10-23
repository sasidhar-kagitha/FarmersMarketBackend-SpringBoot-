package com.example.farmersMarket.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.farmersMarket.Repository.ProductRepository;
import com.example.farmersMarket.Model.Product;
import com.example.farmersMarket.Model.ProductRowMapper;

import java.util.*;


@Service
public class ProductService implements ProductRepository {


    @Autowired 
    private JdbcTemplate jdbcTemp;

    @Override 
    public ArrayList<Product> getProducts()
    {
        return new ArrayList<Product>(jdbcTemp.query("Select * from products",new ProductRowMapper()));
    }


    @Override 
    public Product getProduct(int productId)
    {
         Product product;
        try{

           product = (Product) jdbcTemp.queryForObject("SELECT * FROM products where product_id = ?",new Object[]{productId},new ProductRowMapper());
          return product;

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return null;
    }

    @Override 
    public String addProduct(Product product)
    {
        String sql = "insert into products(title,name,category,img_url,description,quantity,unit,price,location) values(?,?,?,?,?,?,?,?,?)";
        int result = jdbcTemp.update(sql,product.getTitle(),product.getName(),product.getCategory(),product.getImgUrl(),product.getDescription(),product.getQuantity(),product.getUnit(),product.getPrice(),product.getLocation());
        if(result>=1)
         return "product is added sucessfully";
        else
         throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Invalid data");
    }


    @Override 
    public void deleteProduct(int productId)
    {
        
        Product exitingProduct = getProduct(productId);
        System.out.println(exitingProduct);
        if(exitingProduct==null)
          throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Product is Not Found");
        String sqlQuery = "delete from products where product_id=?";
        int result = jdbcTemp.update(sqlQuery,productId);
         throw new ResponseStatusException(HttpStatus.NO_CONTENT,"Sucessfully deleted");
        
        
        
    }

    @Override 
    public Product modifyProduct(int productId,Product product)
    {
        Product exitingProduct = getProduct(productId);

        if(exitingProduct==null)
             throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Product is Not Found");
        String title = product.getTitle()==null?exitingProduct.getTitle():product.getTitle();
        String name = product.getName()==null?exitingProduct.getName():product.getName();
        String category = product.getCategory()==null?exitingProduct.getCategory():product.getCategory();
        String imgUrl =product.getImgUrl()==null?exitingProduct.getImgUrl():product.getImgUrl();
        String description = product.getDescription()==null?exitingProduct.getDescription():product.getDescription();
        int quantity = product.getQuantity()==0?exitingProduct.getQuantity():product.getQuantity();
        String unit = product.getUnit()==null?exitingProduct.getUnit():product.getUnit();
        double price =  product.getPrice()==0?exitingProduct.getPrice():product.getPrice();  
        String location = product.getLocation()==null?exitingProduct.getLocation():product.getLocation();

        String sqlQuery = "update products set title=?,name=?,category=?,img_url=?,description=?,quantity=?,unit=?,price=?,location=? where product_id = ?";

        int result=jdbcTemp.update(sqlQuery,title,name,category,imgUrl,description,quantity,unit,price,location,productId);
        if(result>=1)
            return getProduct(productId);
        return null;
    }
    
}
