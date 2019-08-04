package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.serviceClass;

@RestController
@RequestMapping(path = "/example")
public class controllerClass {
    @Autowired
    private serviceClass zmAdminUserService;

    @PostMapping(path = "")
    public void check() {

        zmAdminUserService.check();

    }

}
