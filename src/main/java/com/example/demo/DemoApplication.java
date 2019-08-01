package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tutorial.starterUtil.service.TestSample;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    TestSample sample;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        sample.startTest();
    }

    @Bean
    public TestSample sample() {
        return new testClass();
    }
}