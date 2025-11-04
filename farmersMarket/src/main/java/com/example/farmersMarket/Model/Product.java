package com.example.farmersMarket.Model;

import java.util.*;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="products")
public class Product {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="product_id")
    private int productId;
    @Column(name="name",unique = true)
    private String name;
    @Column(name="title")
    private String title;
    @Column(name="category")
    private String category;
    @Column(name="img_url")
    private String imgUrl;
    @Column(name="description")
    private String description;
    @Column(name="quantity")
    private int quantity;
    @Column(name="unit")
    private String unit;
    @Column(name="price")
    private double price;
    @Column(name="location")
    private String location;
    @Column(name="date_added")
    private Date date;

    public Product()
    {
        
    }
    public Product(int productId, String name, String title, String category, String imgUrl, String description,int quantity, String unit, double price, String location, Date date) {
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
