package com.ytzl.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ItripSearchApplication {

    public static void main(String[] args) {
        log.info("search---------------------------");
        SpringApplication.run(ItripSearchApplication.class, args);
    }

}
