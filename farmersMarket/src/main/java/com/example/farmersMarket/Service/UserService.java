package com.example.farmersMarket.Service;



import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import com.example.farmersMarket.Model.UserRowMapper;
import com.example.farmersMarket.Model.User;
import com.example.farmersMarket.Repository.UserRepository;

//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;





@Service
public class UserService implements UserRepository {

    @Autowired
    private  JdbcTemplate db;

  //  @Autowired 
  //  private BCryptPasswordEncoder bcyptEncrypPass;



    @Override 

    public ArrayList<User> getUsers()
    {
        List<User> resultList = db.query("SELECT * FROM USERS",new UserRowMapper());
        ArrayList<User> userList = new ArrayList<>(resultList);
        
        return userList;
    }

    @Override
    public String userLogin(User user)
    {
        try{
        User existingUser = (User)db.queryForObject("SELECT * FROM USERS where user_name=?",new Object[] {user.getUserName()},new UserRowMapper());
        if(existingUser.getUserName().equals(user.getUserName()))
        {

           /* Boolean validPassword = bcyptEncrypPass.matches(user.getPassword(),existingUser.getPassword()); 

            if(validPassword)
              return "Valid User,Sorry for inconvience";
            else
              throw new ResponseStatusException(HttpStatus.UNAUTHORIZED,"INVALID PASSWORD");*/ 
              return "Valid";
        }
       throw new ResponseStatusException(HttpStatus.UNAUTHORIZED,"INVALID USER");

    }
    catch(Exception e)
    {
         throw new ResponseStatusException(HttpStatus.UNAUTHORIZED,"INVALID USER");
    }
    }
    
}
