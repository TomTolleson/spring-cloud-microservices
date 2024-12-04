package com.example.serviceb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-b")
public class ServiceBController {
    
    @GetMapping("/info")
    public String getInfo() {
        return "Hello from Service B!";
    }
    
    @GetMapping("/health")
    public String health() {
        return "Service B is healthy";
    }
}