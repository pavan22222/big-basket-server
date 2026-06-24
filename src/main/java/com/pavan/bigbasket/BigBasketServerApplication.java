package com.pavan.bigbasket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BigBasketServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigBasketServerApplication.class, args);
        System.out.println("Hi Pavan");
    }

}
