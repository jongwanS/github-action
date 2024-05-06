package com.example.githubaction.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {
    @GetMapping("/test")
    public ResponseEntity<?> test(){
        log.info("123");
        return ResponseEntity.ok().body("ok");
    }
}
