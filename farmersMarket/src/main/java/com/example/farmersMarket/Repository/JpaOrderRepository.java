package com.example.farmersMarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.farmersMarket.Model.*;
import java.util.List;


@Repository
public interface JpaOrderRepository extends JpaRepository<Order,Integer> {

    public Order findByOrderId(int orderId);
}
