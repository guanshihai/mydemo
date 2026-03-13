package org.example.springtestdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;






@MapperScan("org.example.springtestdemo.mapper")
@SpringBootApplication
public class SpringtestdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringtestdemoApplication.class, args);
    }

}
