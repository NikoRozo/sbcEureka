package com.niko.sbc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SbcEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbcEurekaServerApplication.class, args);
    }

}
