package com.demo.build_exe;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @Value("${app.variable}")
    String message;

    @GetMapping("/hola")
    public String hello() {
        System.out.println(message);
        return "Hello World";
    }

}
