package com.example.farmersMarket.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import com.example.farmersMarket.Model.*;
import com.example.farmersMarket.Service.JpaOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class OrderController {

    @Autowired 
    JpaOrderService service;

    @GetMapping("/orders")
    public List<Order> getOrders()
    {
        return service.getOrders();
    }

    @GetMapping("/orders/{orderId}/user")
    public User getOrderedUser(@PathVariable int orderId)
    {
        return service.getOrderedUser(orderId);
    }

    
}
