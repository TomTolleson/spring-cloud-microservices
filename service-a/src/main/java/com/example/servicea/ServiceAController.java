package com.example.servicea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/service-a")
public class ServiceAController {
    
    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("/data")
    public String getData() {
        // Call service-b
        String serviceBResponse = restTemplate.getForObject(
            "http://service-b/service-b/info", 
            String.class
        );
        return "Response from Service A with Service B data: " + serviceBResponse;
    }
    
    @GetMapping("/health")
    public String health() {
        return "Service A is healthy";
    }
}