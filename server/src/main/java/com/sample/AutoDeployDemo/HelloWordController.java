package com.sample.AutoDeployDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloWordController {

    @GetMapping("/hello")
    public String sayHelloWorld(String name) {
        return "Hello "+ name;
    }
}
