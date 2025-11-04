package com.example.farmersMarket.Repository;

import java.util.*;
import com.example.farmersMarket.Model.*;

public interface OrderRepository {
    
    public List<Order> getOrders();
    public User getOrderedUser(int orderId);
    
}
