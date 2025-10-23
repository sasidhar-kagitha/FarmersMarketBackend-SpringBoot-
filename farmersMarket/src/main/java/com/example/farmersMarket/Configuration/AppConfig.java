/*package com.example.farmersMarket.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
public class AppConfig {



    @Bean 
    public BCryptPasswordEncoder bcyptEncrypPass()
    {
        return new BCryptPasswordEncoder();   
    }

     @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeHttpRequests()
                .requestMatchers("/login","/users").permitAll()
                .anyRequest().authenticated()
            .and()
            .formLogin().disable()  // disable login page
            .httpBasic().disable(); // disable HTTP Basic Auth

        return http.build();
    }


    
}*/
