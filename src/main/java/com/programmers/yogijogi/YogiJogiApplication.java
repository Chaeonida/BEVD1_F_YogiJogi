package com.programmers.yogijogi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class YogiJogiApplication {

    public static final String APPLICATION_LOCATIONS = "spring.config.location="
            + "classpath:application.yaml,"
            + "classpath:aws.yaml";

    public static void main(String[] args) {
        new SpringApplicationBuilder(YogiJogiApplication.class).properties(APPLICATION_LOCATIONS)
                .run(args);
    }

}
