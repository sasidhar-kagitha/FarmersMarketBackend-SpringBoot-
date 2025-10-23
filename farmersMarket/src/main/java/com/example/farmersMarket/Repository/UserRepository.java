package com.example.farmersMarket.Repository;

import java.util.*;
import com.example.farmersMarket.Model.User;

public interface UserRepository {

     public  ArrayList<User> getUsers();
     public String userLogin(User user);
}
