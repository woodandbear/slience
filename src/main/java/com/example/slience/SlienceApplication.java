package com.example.slience;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.slience.dao")
public class SlienceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SlienceApplication.class, args);
    }

}
