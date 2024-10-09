package com.wx.hotel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@MapperScan(basePackages = "com.wx.hotel.mapper")
@ConfigurationPropertiesScan(basePackages = "com.wx")
public class RoomApplication {
    public static void main(String[] args) {
        SpringApplication.run(RoomApplication.class,args);
    }
}
