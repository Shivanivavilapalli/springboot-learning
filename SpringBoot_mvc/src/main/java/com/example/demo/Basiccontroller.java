package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Basiccontroller {

    @GetMapping("/sampleMVC")
    public String display1() {
        return "hi";
    }

    @GetMapping("/display")
    public String display() {
        return "hello mvc...";
    }
}