package com.wdl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication(scanBasePackages = "com.wdl")
@MapperScan("com.wdl.game")
public class SampleApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(SampleApplicationMain.class, args);
    }

}
