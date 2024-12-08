package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {

    private final String branch = "test_demo";
    private final String merge_branch = "demo_to_marster";

    @RequestMapping("/world")
    public String helloWorld() {
        String str = "第二次提交";
        return "Hello World!";
    }
}
