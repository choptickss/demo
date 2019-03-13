package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 23898 on 2019/3/13.
 */

@RestController
public class HelloSpring {

    @RequestMapping(value = "hello")
    public String hello() {
        return "Hello";
    }
}
