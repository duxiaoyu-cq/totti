package com.dxy.totti.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.dxy.*"})
@MapperScan("com.dxy.totti.dao.mapper")
public class ArtemisTottiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtemisTottiApplication.class, args);
    }

}
