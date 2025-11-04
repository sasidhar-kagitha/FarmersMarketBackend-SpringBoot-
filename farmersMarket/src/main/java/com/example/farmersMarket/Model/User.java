package com.example.farmersMarket.Model;


import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Column(name="user_id")
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String userId;

    
    @Column(name="user_name")
    private String userName;
    @Column(name="password")
    private String password; 

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @OneToMany(mappedBy ="user")
    private List<Order> orders;

    public User()
    {

    }

    User(String userId,String userName,String password)
    {
        this.userId = userId;
        this.userName=userName;
        this.password=password;
    }

    public String getUserId()
    {
        return this.userId;
    }

    public String getUserName()
    {
        return this.userName;
    }
    
    public void setUserName(String userName)
    {
        this.userName=userName;
    }
    
    public String getPassword()
    {
        return this.password;
    }
}
