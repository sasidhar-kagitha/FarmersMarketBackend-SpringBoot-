package com.example.farmersMarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class FarmersMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmersMarketApplication.class, args);
	}

}
