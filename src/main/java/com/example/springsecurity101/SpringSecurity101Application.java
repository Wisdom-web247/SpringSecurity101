package com.example.springsecurity101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class SpringSecurity101Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurity101Application.class, args);
        System.out.println("Server running on port: ");
    }

}
