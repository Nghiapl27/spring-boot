package com.nghia.demo.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/Xin chao")
    public String getMessage(){
        return "Xin chao mn";
    }
}
