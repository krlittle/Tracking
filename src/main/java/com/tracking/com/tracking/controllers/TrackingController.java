package com.tracking.com.tracking.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackingController {
    @GetMapping("/sayHey")
    public ResponseEntity<String> sayHey() {
        return new ResponseEntity<String>("hey", HttpStatus.OK);
    }
}
