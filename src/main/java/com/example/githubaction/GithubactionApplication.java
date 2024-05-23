package com.example.githubaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GithubactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubactionApplication.class, args);
    }

}
