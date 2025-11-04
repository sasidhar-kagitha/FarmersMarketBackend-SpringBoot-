package com.example.farmersMarket.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.farmersMarket.Repository.JpaOrderRepository;
import com.example.farmersMarket.Repository.OrderRepository;
import com.example.farmersMarket.Model.*;

@Service
public class JpaOrderService  implements OrderRepository{

    @Autowired 
    JpaOrderRepository jpaRepo;
    @Override 
    public List<Order> getOrders()
    {
        List<Order> orders = jpaRepo.findAll();
        orders.stream().forEach(item->System.out.println(item.getOrderDate()+" "+item.getOrderId()));
        return new ArrayList<>(orders);
    }

    @Override 
    public User getOrderedUser(int orderId)
    {
      try{
      Order order = jpaRepo.findByOrderId(orderId);
      return order.getUser();
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
    
    return null;
    }
    
}
