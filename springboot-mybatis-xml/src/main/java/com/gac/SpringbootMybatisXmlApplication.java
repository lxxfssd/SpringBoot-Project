package com.gac;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan(basePackages = "com.gac")
@MapperScan(basePackages = "com.gac.mapper")
@SpringBootApplication
public class SpringbootMybatisXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisXmlApplication.class, args);
    }
}
