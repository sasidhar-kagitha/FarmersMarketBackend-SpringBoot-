package com.example.farmersMarket.Model;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.farmersMarket.Model.User;

public class UserRowMapper implements RowMapper{

    @Override 

    public User mapRow(ResultSet rs,int rowNums) throws SQLException
    {
        return new User(rs.getString("user_id"),
        rs.getString("user_name"),
        rs.getString("password"));
    }
    
}
