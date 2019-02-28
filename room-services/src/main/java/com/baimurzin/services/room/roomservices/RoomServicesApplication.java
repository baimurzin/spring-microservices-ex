package com.baimurzin.services.room.roomservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class RoomServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoomServicesApplication.class, args);
    }

}
