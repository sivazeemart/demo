package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.tutorial.starterUtil.config.Properties;
import com.tutorial.starterUtil.service.TestSampleImpl;

@Configuration
@EnableConfigurationProperties({TestSampleImpl.class,Properties.class})
public class testClass {
    @Autowired
    TestSampleImpl sample;
    
    @Autowired
    Properties props;

  public void fromJar() {
     sample.startTest();
     System.out.println(props.getUrl());
  }

}
