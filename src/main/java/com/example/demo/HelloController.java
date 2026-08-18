package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/")
    public Map<String, String> hello() {
        return Map.of(
                "message", "Hello from the DevOps Capstone pipeline!",
                "timestamp", Instant.now().toString()
        );
    }

    @GetMapping("/api/status")
    public Map<String, String> status() {
        return Map.of("status", "UP");
    }
}
