package com.chandra.learn.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello Jenkins!";
    }
}
