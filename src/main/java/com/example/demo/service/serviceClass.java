package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.example.demo.testClass;
import com.tutorial.starterUtil.service.TestSample;
import com.tutorial.starterUtil.service.TestSampleImpl;

@Service

public class serviceClass {
    @Autowired
    testClass sample;

    public void check() {
        // TODO Auto-generated method stub
        sample.fromJar();
    }

}
