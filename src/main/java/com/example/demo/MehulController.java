package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MehulController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello world from Mehul controllerr!";
    }

}
