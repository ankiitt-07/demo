package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sarvesh")


public class SarveshController {
@GetMapping("/create")

    private String createName(){
    return "hello sarvesh";
}

}

