package com.example.farmersMarket.Model;


public class User {

    private String userId;
    private String userName;
    private String password; 

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
