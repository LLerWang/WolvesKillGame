package com.wdl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SampleApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(SampleApplicationMain.class, args);
    }

    @RequestMapping("/")
    String index(){
        return "Hello Spring Boot";
    }
}
