package com.learning.deployment.testapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping("/greet")
    ResponseEntity<String> getGreeting(){
        return ResponseEntity.status(HttpStatus.OK).body("Good Evening!");
    }

    @GetMapping("/currentTime")
    ResponseEntity<String> getCurrentTime(){
        return ResponseEntity.status(HttpStatus.OK).body("The Current Time is : " + LocalDateTime.now());
    }
}
