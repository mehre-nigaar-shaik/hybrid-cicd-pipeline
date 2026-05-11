package com.devops.hybrid_cicd_pipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hybrid DevSecOps CI/CD Pipeline Running 🚀";
    }
}