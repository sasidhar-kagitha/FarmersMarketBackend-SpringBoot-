 package com.example.farmersMarket.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
@EnableWebSecurity(debug = true)
@Configuration
public class AppConfig
{

     @Bean 
     public BCryptPasswordEncoder bcyptEncrypPass()     {
         return new BCryptPasswordEncoder();   
    }
    /* 
    public UsernamePasswordAuthenticationFilter usernamePasswordAuthenticationFilter() throws Exception {
        return new UsernamePasswordAuthenticationFilter();}*/

    @Bean
     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
         http
             .csrf().disable()
             .authorizeHttpRequests()
                 .requestMatchers("/auth/login","/users").permitAll()
                 .anyRequest().authenticated()
             .and()
            .formLogin()
            .and()
            .httpBasic();
           
             // disable login page // disable HTTP Basic Auth
           return http.build();

     }
    }