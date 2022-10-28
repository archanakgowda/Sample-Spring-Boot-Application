package com.example.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController { //test to push

    @GetMapping("/data")
    public String getSampleData(){
        return "Sample Data in Get Endpoint";
    }
}
