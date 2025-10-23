package com.example.farmersMarket.Model;

import java.util.*;

public class Product {
    
    
    private int productId;
    private String name;
    private String title;
    private String category;
    private String imgUrl;
    private String description;
    private int quantity;
    private String unit;
    private double price;
    private String location;
    private Date date;

    public Product()
    {
        
    }
    public Product(int productId, String name, String title, String category, String imgUrl, String description,
            int quantity, String unit, double price, String location, Date date) {
        this.productId = productId;
        this.name = name;
        this.title = title;
        this.category = category;
        this.imgUrl = imgUrl;
        this.description = description;
        this.quantity = quantity;
        this.unit = unit;
        this.price = price;
        this.location = location;
        this.date = date;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    
}
