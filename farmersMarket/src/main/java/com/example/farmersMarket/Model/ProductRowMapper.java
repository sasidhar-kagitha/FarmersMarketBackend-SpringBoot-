package com.example.farmersMarket.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.example.farmersMarket.Model.Product;

import java.util.*;

public class ProductRowMapper implements RowMapper{

    @Override 
    public Product mapRow(ResultSet rs,int rowNums) throws SQLException
    {
        return new Product(rs.getInt("product_id"),
        rs.getString("name"),
        rs.getString("title"),
        rs.getString("category"),
        rs.getString("img_url"),
        rs.getString("description"),
        rs.getInt("quantity"),
        rs.getString("unit"),
        rs.getDouble("price"),
        rs.getString("location"),
        rs.getDate("date_added")
        );

    }

    
}
